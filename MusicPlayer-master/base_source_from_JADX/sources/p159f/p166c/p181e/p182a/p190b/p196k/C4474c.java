package p159f.p166c.p181e.p182a.p190b.p196k;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.coocent.music.base.p056ui.activity.AllLyricActivity;
import p159f.p166c.p181e.p182a.p183a.p184a.C4361a;
import p159f.p166c.p181e.p182a.p183a.p189f.C4434c;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.b.k.c */
/* compiled from: LyricUiKit.kt */
public final class C4474c {

    /* renamed from: a */
    public static final C4474c f13061a = new C4474c();

    private C4474c() {
    }

    /* renamed from: b */
    public static final void m19557b(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "musicName");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.cn/search?q=" + str + ".lrc"));
            intent.setFlags(268435456);
            try {
                PendingIntent.getActivity(context, 0, intent, 0).send();
            } catch (PendingIntent.CanceledException e) {
                e.printStackTrace();
                context.startActivity(intent);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo15176a(String str, C4361a aVar) {
        C8594l.m46771e(str, "musicName");
        C8594l.m46771e(aVar, "bindLyricListener");
        C4434c.f13013c.mo15069m0(str, aVar);
    }

    /* renamed from: c */
    public final void mo15177c(Context context, String str, C4361a aVar) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "musicName");
        C8594l.m46771e(aVar, "bindLyricListener");
        AllLyricActivity.f8233C.mo9265a(context, str, aVar);
    }
}
