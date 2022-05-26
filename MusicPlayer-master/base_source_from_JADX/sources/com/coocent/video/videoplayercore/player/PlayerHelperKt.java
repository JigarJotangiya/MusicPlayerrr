package com.coocent.video.videoplayercore.player;

import android.content.Context;
import com.coocent.video.videoplayercore.ConsantsKt;
import kotlinx.coroutines.C8902r0;
import p082e.p126k.p127b.C3823f;
import p082e.p126k.p127b.p128p.C3861b;
import p082e.p126k.p129c.C3862a;
import p082e.p126k.p129c.p130i.C3884d;
import p369i.p370a0.C8374a;
import p369i.p374d0.C8399f;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8598p;
import p369i.p387z.p389d.C8603u;

/* compiled from: PlayerHelper.kt */
public final class PlayerHelperKt {
    static final /* synthetic */ C8399f<Object>[] $$delegatedProperties;
    private static final C8374a dataStore$delegate = C3862a.m16518b(ConsantsKt.DS_NAME, (C3861b) null, (C8570l) null, (C8902r0) null, 14, (Object) null);

    static {
        C8598p pVar = new C8598p(PlayerHelperKt.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        C8603u.m46788d(pVar);
        $$delegatedProperties = new C8399f[]{pVar};
    }

    public static final C3823f<C3884d> getDataStore(Context context) {
        C8594l.m46771e(context, "<this>");
        return (C3823f) dataStore$delegate.mo13352a(context, $$delegatedProperties[0]);
    }
}
