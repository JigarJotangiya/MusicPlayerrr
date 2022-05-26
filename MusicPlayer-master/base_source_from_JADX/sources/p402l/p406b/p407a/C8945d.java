package p402l.p406b.p407a;

/* renamed from: l.b.a.d */
/* compiled from: SupportedFileFormat */
public enum C8945d {
    OGG("ogg"),
    MP3("mp3"),
    FLAC("flac"),
    MP4("mp4"),
    M4A("m4a"),
    M4P("m4p"),
    WMA("wma"),
    WAV("wav"),
    RA("ra"),
    RM("rm"),
    M4B("m4b"),
    AIF("aif");
    
    private String filesuffix;

    private C8945d(String str) {
        this.filesuffix = str;
    }

    public String getFilesuffix() {
        return this.filesuffix;
    }
}
