package com.satya.restapp1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

//http://localhost:9090/restWS-Download-file/rest/university/get
@Path("/university")
public class UniversityRESTWS {

	@POST
	@Path("/upload")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public String uploadFile( 
			@FormDataParam("file") InputStream file,
            @FormDataParam("file") FormDataContentDisposition fileDisposition) {
		saveTodisk(file, fileDisposition);
		return "File Uploded Successfully";
	}

	private void saveTodisk(InputStream file,
			FormDataContentDisposition fileDisposition) {
		String uploadFileLocation = "D://" + fileDisposition.getFileName();
		try {
			OutputStream stream = new FileOutputStream(new File(uploadFileLocation));
			int read = 0;
			byte bytes[] = new byte[1024];
			while ((read = file.read(bytes)) != -1) {
				stream.write(bytes, 0, read);
			}
			stream.flush();
			stream.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
}
