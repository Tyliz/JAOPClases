package Facade;

import java.io.File;

public class VideoConversorFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversorFacade: convertion started...");

        VideoFile file = new VideoFile(fileName);

        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;

        if (format.equals("mp4")) {
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }

        VideoFile buffer = BitradeReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitradeReader.convert(buffer, destinationCodec);

        File result = (new AudioMixer()).fix(intermediateResult);

        System.out.println("VideioConversionFacade: conversion completed");

        return result;
    }
}
