////
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by Fernflower decompiler)
////
//
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoDatabase;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.sql.Driver;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import org.bson.Document;
//import org.neo4j.driver.AuthTokens;
//import org.neo4j.driver.Driver;
//import org.neo4j.driver.GraphDatabase;
//
//public class CheckDBConnection {
//  public CheckDBConnection() {
//  }
//
//  public static void main(String[] args) {
//    CheckDBConnection checkDBConnection = new CheckDBConnection();
//    String status = checkDBConnection.getDocDatasource();
//    System.out.println(status);
//
//    try {
//      String Neo4jStatus = checkDBConnection.getNeoDriver();
//      System.out.println(Neo4jStatus);
//    } catch (Exception var4) {
//      System.out.println("Exception in neo4j connection code");
//    }
//
//  }
//
//  private String getDocDatasource() {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter datasource.mongoDB.host : ");
//    String mongoHosts = sc.nextLine();
//    System.out.print("Enter datasource.mongoDB.database : ");
//    String database = sc.nextLine();
//    System.out.print("Enter datasource.mongoDB.userName : ");
//    String userName = sc.nextLine();
//    System.out.print("Enter datasource.mongoDB.password : ");
//    String password = sc.nextLine();
//    System.out.print("Enter datasource.mongoDB.replicaSetName (Type 'noReplica' if NA): ");
//    String replicaSetName = sc.nextLine();
//    System.out.print("Enter datasource.mongoDB.port : ");
//    int mongoPort = sc.nextInt();
//    String connection = null;
//    if (mongoHosts.indexOf(",") > 0) {
//      connection = String.format("mongodb://%s:%s@", userName, password);
//      String[] var9 = mongoHosts.trim().split("\\s*,\\s*");
//      int var10 = var9.length;
//
//      for(int var11 = 0; var11 < var10; ++var11) {
//        String host = var9[var11];
//        connection = connection + String.format("%s:%d,", host, mongoPort);
//      }
//
//      connection = connection.substring(0, connection.length() - 1);
//      connection = connection + String.format("/?authSource=%s&replicaSet=%s&tls=false", database, replicaSetName);
//    } else {
//      connection = String.format("mongodb://%s:%s@%s:%d/?authSource=%s", userName, password, mongoHosts, mongoPort, database);
//    }
//
//    MongoDatabase mongoDatabase = MongoClients.create(connection).getDatabase(database);
//
//    try {
//      mongoDatabase.getCollection("Users").countDocuments(new Document());
//      return "***********Mongo server is connected***********";
//    } catch (Exception var13) {
//      return String.format("***********Mongo server is not connected***********");
//    }
//  }
//
//  public String getNeoDriver() throws URISyntaxException {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter datasource.neo4j.clusterCoreHosts (Type 'null' if NA) : ");
//    String clusterCoreHosts = sc.nextLine();
//    System.out.print("Enter datasource.neo4j.userName : ");
//    String userName = sc.nextLine();
//    System.out.print("Enter datasource.neo4j.password : ");
//    String password = sc.nextLine();
//    System.out.print("datasource.neo4j.uri : ");
//    String neo4jURI = sc.nextLine();
//    if (clusterCoreHosts != null && !clusterCoreHosts.equals("null") && clusterCoreHosts.length() > 0) {
//      List<URI> uris = new ArrayList();
//      String[] var7 = clusterCoreHosts.split(",");
//      int var8 = var7.length;
//
//      for(int var9 = 0; var9 < var8; ++var9) {
//        String h = var7[var9];
//        uris.add(new URI(String.format("bolt+routing://%s:7687", h)));
//      }
//
//      try {
//        Driver driver = GraphDatabase.driver(String.valueOf(uris), AuthTokens.basic(userName, password));
//        driver.session().beginTransaction();
//        return "***********Neo4j server is connected***********";
//      } catch (Exception var11) {
//        return String.format("***********Neo4j server is not connected***********");
//      }
//    } else {
//      try {
//        Driver driver = GraphDatabase.driver(String.valueOf(neo4jURI), AuthTokens.basic(userName, password));
//        driver.session().beginTransaction();
//        return "***********Neo4j server is connected***********";
//      } catch (Exception var12) {
//        return String.format("***********Neo4j server is not connected***********");
//      }
//    }
//  }
//}
