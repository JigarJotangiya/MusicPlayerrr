package com.p256kk.taurus.playerbase.p258b;

import com.p256kk.taurus.playerbase.p259c.C6619b;
import com.p256kk.taurus.playerbase.player.SysMediaPlayer;
import p082e.p098e.C3479h;

/* renamed from: com.kk.taurus.playerbase.b.b */
/* compiled from: PlayerConfig */
public class C6615b {

    /* renamed from: a */
    private static int f30001a = 0;

    /* renamed from: b */
    private static C3479h<C6619b> f30002b = new C3479h<>(2);

    /* renamed from: c */
    private static boolean f30003c = false;

    /* renamed from: d */
    private static boolean f30004d = false;

    /* renamed from: e */
    private static int f30005e = 1000;

    static {
        m38158a(new C6619b(0, SysMediaPlayer.class.getName(), "MediaPlayer"));
        m38165h(0);
    }

    /* renamed from: a */
    public static void m38158a(C6619b bVar) {
        f30002b.mo12414k(bVar.mo25914c(), bVar);
    }

    /* renamed from: b */
    public static int m38159b() {
        return f30001a;
    }

    /* renamed from: c */
    public static C6619b m38160c(int i) {
        return f30002b.mo12409f(i);
    }

    /* renamed from: d */
    public static int m38161d() {
        if (f30005e <= 50) {
            f30005e = 50;
        }
        return f30005e;
    }

    /* renamed from: e */
    public static boolean m38162e(int i) {
        return m38160c(i) != null;
    }

    /* renamed from: f */
    public static boolean m38163f() {
        return f30004d;
    }

    /* renamed from: g */
    public static boolean m38164g() {
        return f30003c;
    }

    /* renamed from: h */
    public static void m38165h(int i) {
        f30001a = i;
    }

    /* renamed from: i */
    public static void m38166i(int i) {
        f30005e = i;
    }
}
