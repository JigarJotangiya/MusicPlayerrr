package coocent.music.player.skin.p274c;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: coocent.music.player.skin.c.c */
/* compiled from: FileUtils */
public class C7105c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C7107b f31385a;

    /* renamed from: coocent.music.player.skin.c.c$a */
    /* compiled from: FileUtils */
    class C7106a extends Handler {
        C7106a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (C7105c.this.f31385a != null) {
                if (message.what == 1) {
                    C7105c.this.f31385a.mo27301b();
                }
                if (message.what == 0) {
                    C7105c.this.f31385a.mo27302c(message.obj.toString());
                }
            }
        }
    }

    /* renamed from: coocent.music.player.skin.c.c$b */
    /* compiled from: FileUtils */
    public interface C7107b {
        /* renamed from: b */
        void mo27301b();

        /* renamed from: c */
        void mo27302c(String str);
    }

    public C7105c(Context context) {
        new C7106a(Looper.getMainLooper());
    }

    /* renamed from: b */
    public static int m40458b(Context context, Uri uri, String str) {
        if (uri.getAuthority() == null) {
            return 1;
        }
        InputStream inputStream = null;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            boolean z = !m40459c(context, openInputStream, str);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    return 1;
                }
            }
            return z ? 1 : 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            if (inputStream == null) {
                return 1;
            }
            inputStream.close();
            return 1;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* renamed from: c */
    private static boolean m40459c(Context context, InputStream inputStream, String str) {
        FileOutputStream fileOutputStream;
        if (inputStream == null) {
            return false;
        }
        byte[] bArr = new byte[8192];
        File file = new File(context.getCacheDir(), str);
        if (file.exists()) {
            file.delete();
        }
        try {
            fileOutputStream = new FileOutputStream(file);
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: d */
    public String mo27299d(Context context) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "CoocentSkin";
    }
}
