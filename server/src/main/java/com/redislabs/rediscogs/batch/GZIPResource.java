package com.redislabs.rediscogs.batch;

import java.io.IOException;
import java.util.zip.GZIPInputStream;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

public class GZIPResource extends InputStreamResource implements Resource {

	public GZIPResource(Resource delegate) throws IOException {
		super(new GZIPInputStream(delegate.getInputStream()));
	}

}