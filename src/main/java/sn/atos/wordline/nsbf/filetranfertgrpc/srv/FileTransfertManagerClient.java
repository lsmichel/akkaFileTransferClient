
// Generated by Akka gRPC. DO NOT EDIT.
package sn.atos.wordline.nsbf.filetranfertgrpc.srv;

import akka.grpc.internal.*;
import akka.grpc.GrpcClientSettings;
import akka.grpc.javadsl.AkkaGrpcClient;
import akka.stream.ActorMaterializer;
import akka.stream.Materializer;

import io.grpc.ManagedChannel;
import io.grpc.MethodDescriptor;

import static sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfertManager.Serializers.*;

import scala.concurrent.ExecutionContext;


import akka.grpc.javadsl.SingleResponseRequestBuilder;


public abstract class FileTransfertManagerClient extends FileTransfertManagerClientPowerApi implements FileTransfertManager, AkkaGrpcClient {
  public static final FileTransfertManagerClient create(GrpcClientSettings settings, Materializer mat, ExecutionContext ec) {
    return new DefaultFileTransfertManagerClient(settings, mat, ec);
  }

  protected final static class DefaultFileTransfertManagerClient extends FileTransfertManagerClient {

      private final ClientState clientState;
      private final GrpcClientSettings settings;
      private final io.grpc.CallOptions options;
      private final Materializer mat;
      private final ExecutionContext ec;

      private DefaultFileTransfertManagerClient(GrpcClientSettings settings, Materializer mat, ExecutionContext ec) {
        this.settings = settings;
        this.mat = mat;
        this.ec = ec;
        this.clientState = new ClientState(settings, mat, ec);
        this.options = NettyClientUtils.callOptions(settings);

        if (mat instanceof ActorMaterializer) {
          ((ActorMaterializer) mat).system().getWhenTerminated().whenComplete((v, e) -> close());
        }
      }

  
    
      private final SingleResponseRequestBuilder<sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart, sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed> postFileRequestBuilder(scala.concurrent.Future<ManagedChannel> channel){
        return new JavaUnaryRequestBuilder<>(postFileDescriptor, channel, options, settings, ec);
      }
    
  

      

        /**
         * For access to method metadata use the parameterless version of postFile
         */
        public java.util.concurrent.CompletionStage<sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed> postFile(sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart request) {
          return postFile().invoke(request);
        }

        /**
         * Lower level "lifted" version of the method, giving access to request metadata etc.
         * prefer postFile(sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart) if possible.
         */
        
          public SingleResponseRequestBuilder<sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart, sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed> postFile()
        
        {
          return clientState.withChannel( this::postFileRequestBuilder);
        }
      

      
        private static MethodDescriptor<sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart, sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed> postFileDescriptor =
          MethodDescriptor.<sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart, sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed>newBuilder()
            .setType(
   MethodDescriptor.MethodType.UNARY 
  
  
  
)
            .setFullMethodName(MethodDescriptor.generateFullMethodName("FileTransfertManager.FileTransfertManager", "PostFile"))
            .setRequestMarshaller(new ProtoMarshaller<sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart>(filePartSerializer))
            .setResponseMarshaller(new ProtoMarshaller<sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed>(PostFileActionPerformedSerializer))
            .setSampledToLocalTracing(true)
            .build();
        

      /**
       * Initiates a shutdown in which preexisting and new calls are cancelled.
       */
      public java.util.concurrent.CompletionStage<akka.Done> close() {
        return clientState.closeCS() ;
      }

     /**
      * Returns a CompletionState that completes successfully when shutdown via close()
      * or exceptionally if a connection can not be established after maxConnectionAttempts.
      */
      public java.util.concurrent.CompletionStage<akka.Done> closed() {
        return clientState.closedCS();
      }
  }

}


