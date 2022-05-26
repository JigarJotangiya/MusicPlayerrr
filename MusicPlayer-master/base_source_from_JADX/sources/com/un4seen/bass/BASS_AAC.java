package com.un4seen.bass;

import com.un4seen.bass.BASS;
import java.nio.ByteBuffer;

public class BASS_AAC {
    public static final int BASS_AAC_FRAME960 = 4096;
    public static final int BASS_AAC_STEREO = 4194304;
    public static final int BASS_CONFIG_AAC_MP4 = 67329;
    public static final int BASS_CONFIG_AAC_PRESCAN = 67330;
    public static final int BASS_CONFIG_MP4_VIDEO = 67328;
    public static final int BASS_CTYPE_STREAM_AAC = 68352;
    public static final int BASS_CTYPE_STREAM_MP4 = 68353;
    public static final int BASS_ERROR_MP4_NOSTREAM = 6000;

    public static native int BASS_AAC_StreamCreateFile(String str, long j, long j2, int i);

    public static native int BASS_AAC_StreamCreateFile(ByteBuffer byteBuffer, long j, long j2, int i);

    public static native int BASS_AAC_StreamCreateFileUser(int i, int i2, BASS.BASS_FILEPROCS bass_fileprocs, Object obj);

    public static native int BASS_AAC_StreamCreateURL(String str, int i, int i2, BASS.DOWNLOADPROC downloadproc, Object obj);

    public static native int BASS_MP4_StreamCreateFile(String str, long j, long j2, int i);

    public static native int BASS_MP4_StreamCreateFile(ByteBuffer byteBuffer, long j, long j2, int i);

    public static native int BASS_MP4_StreamCreateFileUser(int i, int i2, BASS.BASS_FILEPROCS bass_fileprocs, Object obj);
}
