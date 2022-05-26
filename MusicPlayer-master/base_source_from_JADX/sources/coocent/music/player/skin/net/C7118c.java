package coocent.music.player.skin.net;

import android.os.AsyncTask;
import android.util.Log;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.skin.p272a.C7100b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: coocent.music.player.skin.net.c */
/* compiled from: SkinDowloadTask */
public class C7118c extends AsyncTask<Void, Void, Boolean> {

    /* renamed from: a */
    private MySkinEntity f31403a;

    /* renamed from: b */
    private String f31404b = ("skin" + this.f31403a.mo27305a() + ".zip");

    /* renamed from: c */
    private C7100b f31405c;

    public C7118c(MySkinEntity mySkinEntity) {
        this.f31403a = mySkinEntity;
    }

    /* renamed from: c */
    private boolean m40498c() {
        try {
            InputStream b = mo27337b();
            if (b == null) {
                return false;
            }
            boolean f = m40499f(BaseApplication.f31160x + "/" + this.f31404b, b);
            b.close();
            return f;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: f */
    private boolean m40499f(String str, InputStream inputStream) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str));
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                }
                fileOutputStream2.flush();
                try {
                    fileOutputStream2.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return true;
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    e.printStackTrace();
                    try {
                        fileOutputStream.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    try {
                        fileOutputStream.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                fileOutputStream.close();
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            e.printStackTrace();
            fileOutputStream.close();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean doInBackground(Void... voidArr) {
        boolean c = m40498c();
        boolean z = false;
        boolean s = c ? BaseApplication.m40046s(this.f31403a) : false;
        if (c && s) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: b */
    public InputStream mo27337b() {
        String str = BaseApplication.f31161y;
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void onPostExecute(Boolean bool) {
        if (isCancelled()) {
            return;
        }
        if (bool.booleanValue()) {
            Log.e("onProgress", "finish");
            C7100b bVar = this.f31405c;
            if (bVar != null) {
                bVar.mo26770L0(100);
                return;
            }
            return;
        }
        Log.e("onProgress", "fail");
        C7100b bVar2 = this.f31405c;
        if (bVar2 != null) {
            bVar2.mo26770L0(-1);
        }
    }

    /* renamed from: e */
    public void mo27340e(C7100b bVar) {
        this.f31405c = bVar;
    }
}
