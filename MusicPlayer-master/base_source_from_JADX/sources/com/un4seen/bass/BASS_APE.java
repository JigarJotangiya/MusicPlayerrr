package com.un4seen.bass;

import com.un4seen.bass.BASS;
import java.nio.ByteBuffer;

public class BASS_APE {
    public static final int BASS_CTYPE_STREAM_APE = 67328;

    public static native int BASS_APE_StreamCreateFile(String str, long j, long j2, int i);

    public static native int BASS_APE_StreamCreateFile(ByteBuffer byteBuffer, long j, long j2, int i);

    public static native int BASS_APE_StreamCreateFileUser(int i, int i2, BASS.BASS_FILEPROCS bass_fileprocs, Object obj);
}
