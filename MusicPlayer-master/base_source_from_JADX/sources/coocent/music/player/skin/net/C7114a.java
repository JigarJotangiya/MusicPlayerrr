package coocent.music.player.skin.net;

import android.os.AsyncTask;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.skin.p272a.C7099a;
import java.io.InputStream;
import java.util.ArrayList;
import p342g.p343a.p344a.p347d.C7975e;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: coocent.music.player.skin.net.a */
/* compiled from: SkinConfigXmlParseTask */
public class C7114a extends AsyncTask<Void, Void, ArrayList<MySkinEntity>> {

    /* renamed from: a */
    private int f31398a = -1;

    /* renamed from: b */
    private C7099a f31399b;

    public C7114a(int i) {
        this.f31398a = i;
    }

    /* renamed from: c */
    private ArrayList<MySkinEntity> m40490c() {
        try {
            InputStream b = mo27326b();
            if (b == null) {
                return null;
            }
            ArrayList<MySkinEntity> a = new C7115b(C8345u.m46327h()).mo27331a(b);
            b.close();
            return a;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    private ArrayList<MySkinEntity> m40491d() {
        return (ArrayList) C7975e.m43662d(C8345u.m46327h()).mo29516e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<MySkinEntity> doInBackground(Void... voidArr) {
        int i = this.f31398a;
        if (i == 0) {
            return m40490c();
        }
        if (i == 1) {
            return m40491d();
        }
        return null;
    }

    /* renamed from: b */
    public InputStream mo27326b() {
        String str = BaseApplication.f31161y;
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void onPostExecute(ArrayList<MySkinEntity> arrayList) {
        C7099a aVar;
        if (!isCancelled() && (aVar = this.f31399b) != null) {
            aVar.mo27286d(arrayList);
        }
    }

    /* renamed from: f */
    public void mo27329f(C7099a aVar) {
        this.f31399b = aVar;
    }
}
