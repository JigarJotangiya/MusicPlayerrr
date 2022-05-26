package net.coocent.android.xmlparser;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;

/* renamed from: net.coocent.android.xmlparser.l */
/* compiled from: AsyncImageLoader */
public class C9459l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static Map<String, SoftReference<Bitmap>> f36417a = new HashMap();

    /* renamed from: net.coocent.android.xmlparser.l$a */
    /* compiled from: AsyncImageLoader */
    public interface C9460a {
        /* renamed from: a */
        void mo32567a(Bitmap bitmap);
    }

    /* renamed from: net.coocent.android.xmlparser.l$b */
    /* compiled from: AsyncImageLoader */
    private static class C9461b extends AsyncTask<String, Integer, Bitmap> {

        /* renamed from: a */
        private C9460a f36418a;

        public C9461b(C9460a aVar) {
            this.f36418a = aVar;
        }

        /* renamed from: b */
        private void m49809b(String str, String str2) {
            File file = new File(str2);
            try {
                InputStream inputStream = new URL(str).openConnection().getInputStream();
                byte[] bArr = new byte[1024];
                FileOutputStream fileOutputStream = new FileOutputStream(str2 + ".tmp");
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        new File(str2 + ".tmp").renameTo(file);
                        return;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: c */
        private Bitmap m49810c(String str) {
            if (new File(str).exists()) {
                try {
                    return BitmapFactory.decodeFile(str, new BitmapFactory.Options());
                } catch (OutOfMemoryError unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            if (C9459l.f36417a.containsKey(strArr[0])) {
                SoftReference softReference = (SoftReference) C9459l.f36417a.get(strArr[0]);
                Bitmap bitmap = softReference != null ? (Bitmap) softReference.get() : null;
                if (bitmap != null) {
                    return bitmap;
                }
                C9459l.f36417a.remove(strArr[0]);
            }
            Bitmap c = m49810c(strArr[0]);
            if (c == null) {
                m49809b(strArr[1], strArr[0]);
                c = m49810c(strArr[0]);
            }
            C9459l.f36417a.put(strArr[0], new SoftReference(c));
            return c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void onPostExecute(Bitmap bitmap) {
            C9460a aVar = this.f36418a;
            if (aVar != null) {
                aVar.mo32567a(bitmap);
                this.f36418a = null;
            }
        }
    }

    /* renamed from: b */
    public static void m49807b(String str, String str2, C9460a aVar) {
        new C9461b(aVar).executeOnExecutor(Executors.newCachedThreadPool(), new String[]{str2, str});
    }
}
