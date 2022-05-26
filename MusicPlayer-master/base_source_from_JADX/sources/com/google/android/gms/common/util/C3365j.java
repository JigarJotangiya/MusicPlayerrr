package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
/* renamed from: com.google.android.gms.common.util.j */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3365j {
    /* renamed from: a */
    public static void m14462a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public static long m14463b(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull OutputStream outputStream) throws IOException {
        return m14464c(inputStream, outputStream, false, 1024);
    }

    @Deprecated
    /* renamed from: c */
    public static long m14464c(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z) {
                    m14462a(inputStream);
                    m14462a(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            m14462a(inputStream);
            m14462a(outputStream);
        }
        return j;
    }

    @RecentlyNonNull
    @Deprecated
    /* renamed from: d */
    public static byte[] m14465d(@RecentlyNonNull InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m14464c(inputStream, byteArrayOutputStream, z, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
