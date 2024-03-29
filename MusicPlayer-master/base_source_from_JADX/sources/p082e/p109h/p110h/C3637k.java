package p082e.p109h.p110h;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p082e.p109h.p116m.C3670f;

/* renamed from: e.h.h.k */
/* compiled from: TypefaceCompatUtil */
public class C3637k {
    /* renamed from: a */
    public static void m15683a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static ByteBuffer m15684b(Context context, Resources resources, int i) {
        File e = m15687e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!m15685c(e, resources, i)) {
                return null;
            }
            ByteBuffer g = m15689g(e);
            e.delete();
            return g;
        } finally {
            e.delete();
        }
    }

    /* renamed from: c */
    public static boolean m15685c(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean d = m15686d(file, inputStream);
                m15683a(inputStream);
                return d;
            } catch (Throwable th) {
                th = th;
                m15683a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m15683a(inputStream);
            throw th;
        }
    }

    /* renamed from: d */
    public static boolean m15686d(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        m15683a(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m15683a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    m15683a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                m15683a(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m15683a(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    /* renamed from: e */
    public static File m15687e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
        while (i < 100) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    public static ByteBuffer m15688f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        FileInputStream fileInputStream;
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return map;
            } catch (Throwable th) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                throw th;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    /* renamed from: g */
    private static ByteBuffer m15689g(File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            fileInputStream.close();
            return map;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: h */
    public static Map<Uri, ByteBuffer> m15690h(Context context, C3670f.C3672b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C3670f.C3672b bVar : bVarArr) {
            if (bVar.mo12947b() == 0) {
                Uri d = bVar.mo12949d();
                if (!hashMap.containsKey(d)) {
                    hashMap.put(d, m15688f(context, cancellationSignal, d));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
