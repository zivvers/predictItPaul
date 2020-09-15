package com.predictItPaul

/* document type */


import java.time._ // ??
import scala.concurrent.Future
import scala.concurrent.duration._

import akka.util.ByteString

import akka.actor.typed.ActorSystem





object App {

  def main(args: Array[String]) {

    val greeterMain: ActorSystem[tools.GreeterMain.SayHello] = ActorSystem(tools.GreeterMain(), "AkkaQuickStart")

    val greeter = context.spawn(Greeter(), "greeter")
    val replyTo = context.spawn(GreeterBot(max = 3), message.name)
    /*
    var websiteURL : String = "";
    
    implicit val system = ActorSystem()
    implicit val dispatcher = system.dispatcher

    val response: HttpResponse = ???

    val strictEntity: Future[HttpEntity.Strict] = response.entity.toStrict(3.seconds)



    if (args.length == 0) {
        
    }
    else {

    }
    
    val source = io.Source.fromFile("/usr/src/app/PredictItPaul/ref/state-markets.csv")

    val sourceLines : Array[String] = source.getLines.toArray

    val stateTuples : Array[String] = sourceLines.map( line => line.split(",").map(_.trim) ).map(tup => s"https://www.predictit.org/api/marketdata/markets/${tup(0)}")
    */
    //println( stateTuples )
    //println("num state tuples: " + stateTuples.size)
        
        
        
    




    /*
    var testURL : String = "https://bandcamp.com/sometimesgreg";

    //creeper.expandBuyerPurchases( testURL )
    println("size of buyers curr process: " + purchaseURLs)
    //creeper.testPull()
    */
    /*
    ( artist: String
                , album: String
                , url: String
                , rawLocation: String
                , parsedLocation: String
                , parent: String
                , numBuyers: Int)*/
    /*
    val db : MongoTool = new MongoTool("test")

    val testL : List[BandAlbum] = List( BandAlbum("Alex G", "Race", "www...", "Philly", "", "", 500)
                                        , BandAlbum("Alex G", "House", "www...H", "Philly", "", "", 500) )

    db.insertList( testL )
    */

    /*
    println("Website is: " + websiteURL);
    
    creeper.testUpload();

    Thread.sleep(5000);

    creeper.printFirst();

    println("..ok done");
    */
  }

};





