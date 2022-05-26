package com.bumptech.glide.load.p034o;

import android.util.Log;
import com.bumptech.glide.load.C1747d;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.p051s.C2179a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.o.c */
/* compiled from: ByteBufferEncoder */
public class C1920c implements C1747d<ByteBuffer> {
    /* renamed from: c */
    public boolean mo7680a(ByteBuffer byteBuffer, File file, C1790i iVar) {
        try {
            C2179a.m10239e(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
