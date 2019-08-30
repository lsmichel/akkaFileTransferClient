/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.atos.wordline.nsbf.filetranfertgrpc.srv;

import akka.Done;
import akka.actor.ActorSystem;
import akka.grpc.GrpcClientSettings;
import akka.stream.ActorMaterializer;
import akka.stream.IOResult;
import akka.stream.Materializer;
import akka.stream.javadsl.FileIO;
import akka.stream.javadsl.Sink;
import akka.util.ByteString;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.CompletionStage;
import java.util.zip.Deflater;
import sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfertManagerClient.DefaultFileTransfertManagerClient;

/**
 *
 * @author A746054
 */
public class Client {
     public static void main(String[] args) throws Exception {

    String serverHost = "127.0.0.1";
    int serverPort = 8082;
    ActorSystem system = ActorSystem.create("HelloWorldClient");
    Materializer materializer = ActorMaterializer.create(system);

    GrpcClientSettings settings = GrpcClientSettings.fromConfig(FileTransfertManager.name, system);
    
     FileTransfertManagerClient client =  DefaultFileTransfertManagerClient.create(settings, materializer, system.dispatcher());

     final Path file = Paths.get("C:\\Users\\A746054\\Documents\\cadrage_MTF_V1.3.pptx");
  
     
     
     Deflater compressor = new Deflater();
     compressor.setLevel(Deflater.BEST_COMPRESSION);
     Sink<ByteString, CompletionStage<Done>> printlnSink;
         printlnSink = Sink.<ByteString>foreach(chunk -> {
           
             filePart request = filePart
                     .newBuilder()
                     .setChunk(com.google.protobuf.ByteString.copyFrom(chunk.toArray()))
                     .build();
             CompletionStage<PostFileActionPerformed> reply = client.postFile(request);
             System.out.println("got single reply: " + reply.toCompletableFuture().get());
         });

         IOResult ioResult = FileIO
                 .fromPath(file)
                 .to(printlnSink)
                 .run(materializer)
                 .toCompletableFuture()
                 .get();
         system.terminate();
         
}
}
