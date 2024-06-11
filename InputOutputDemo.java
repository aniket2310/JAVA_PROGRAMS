/*
import java.i.o.*;

source  as [console/API/file/Applicaion] ----->Java Application--------> Destination as [console/API/file/Applicaion]

    Read data                                       logic                           Write Data
called as in Programing language InputStream                          called as in Programing language  OutputStream

your source can be console for input for an output on a any destination.
your source can be file for input for an output on a any destination.
your source can be API for input for an output on a any destination.
your source can be Application for input for an output on a any destination.




                                        Java Stream I/O
                                                ↓
              Byte Stream[1/0]-------------------------------------Character Stream[a to z / A to Z]
                     ↓                                                          ↓
           InputStream ,         Outputstream                                  Reader ,         Writer
                        ↓                                                       ↓
          FileInputStream       FileOutputStream                             File Reader        FileWtiter
          DataInputStream       DataOutputStream                             PipeReader         PipeWriter
          ObjectInputStream     ObjectOutputStream                           InputStreamReader  OutputStreamReader
          BufferInputStream     BufferOutputStream                           BufferReader       BufferWriter


They procress the data byte by byte                                         They procress the data character by character
The data 8 bits maximum at a time                                           They read/write data 16 bits max at a time
they are mostly  suitable to procress binary files                             they are most suitable to  procress with text files
All byte straeam classes end with I/O Stream                                All character straeam classes end with reader and writer


 */

public class InputOutputDemo {

    public static void main(String[] args) {

    }
}
