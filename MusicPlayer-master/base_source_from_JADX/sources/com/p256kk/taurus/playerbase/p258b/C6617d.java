package com.p256kk.taurus.playerbase.p258b;

import com.p256kk.taurus.playerbase.player.BaseInternalPlayer;
import java.lang.reflect.Constructor;

/* renamed from: com.kk.taurus.playerbase.b.d */
/* compiled from: PlayerLoader */
public class C6617d {
    /* renamed from: a */
    private static Constructor m38168a(Class cls) {
        try {
            return cls.getConstructor(new Class[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static Object m38169b(int i) {
        Constructor a;
        try {
            Class c = m38170c(C6615b.m38160c(i).mo25912a());
            if (c == null || (a = m38168a(c)) == null) {
                return null;
            }
            return a.newInstance(new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private static Class m38170c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static BaseInternalPlayer m38171d(int i) {
        try {
            Object b = m38169b(i);
            if (b instanceof BaseInternalPlayer) {
                return (BaseInternalPlayer) b;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
