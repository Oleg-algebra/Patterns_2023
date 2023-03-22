public class UserConverter {

    public VideoFile convert(VideoFile videoFile, Codec destinationCodec){
        System.out.println("\n======= VideoConversionFacade: conversion started. =======");
        Codec sourceCodec = CodecFactory.extract(videoFile);

        //Codec destinationCodec = new MPEG4CompressionCodec();
        Buffer buffer = BitrateReader.read(videoFile, sourceCodec);
        VideoFile videoFileConverted = BitrateReader.convert(buffer, videoFile.getName(), destinationCodec);
        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fix(videoFileConverted, videoFile.getAudioBuffer());

        System.out.println("====== VideoConversionFacade: conversion completed =======");
        return videoFileConverted;
    }

}
