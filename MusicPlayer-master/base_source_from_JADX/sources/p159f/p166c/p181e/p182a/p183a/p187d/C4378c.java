package p159f.p166c.p181e.p182a.p183a.p187d;

import java.io.File;
import p159f.p166c.p181e.p182a.p183a.p184a.C4361a;
import p159f.p166c.p181e.p182a.p183a.p189f.C4445h;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.d.c */
/* compiled from: LyricKit.kt */
public final class C4378c {

    /* renamed from: a */
    private static String f12967a = "";

    /* renamed from: b */
    private static C4361a f12968b;

    /* renamed from: c */
    public static final C4378c f12969c = new C4378c();

    private C4378c() {
    }

    /* renamed from: a */
    public final boolean mo14931a(String str, String str2) {
        C8594l.m46771e(str, "path");
        C8594l.m46771e(str2, "musicName");
        return C4445h.m19499a(str, f12967a + File.separator + str2 + ".lrc");
    }

    /* renamed from: b */
    public final boolean mo14932b(String str) {
        C8594l.m46771e(str, "musicName");
        return C4445h.m19500b(f12967a + File.separator + str + ".lrc");
    }

    /* renamed from: c */
    public final C4361a mo14933c() {
        return f12968b;
    }

    /* renamed from: d */
    public final String mo14934d() {
        return f12967a;
    }

    /* renamed from: e */
    public final boolean mo14935e(String str, String str2) {
        C8594l.m46771e(str, "oldName");
        C8594l.m46771e(str2, "newName");
        StringBuilder sb = new StringBuilder();
        sb.append(f12967a);
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        sb.append(".lrc");
        File file = new File(sb.toString());
        if (!file.exists()) {
            return false;
        }
        return file.renameTo(new File(f12967a + str3 + str2 + ".lrc"));
    }

    /* renamed from: f */
    public final void mo14936f(C4361a aVar) {
        f12968b = aVar;
    }

    /* renamed from: g */
    public final void mo14937g(String str) {
        C8594l.m46771e(str, "<set-?>");
        f12967a = str;
    }
}
