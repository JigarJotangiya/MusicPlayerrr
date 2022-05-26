package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.C6454a;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.install.C6460a;
import com.google.android.play.core.install.C6461b;
import p159f.p243f.p245b.p318c.p319a.p323d.C7632e;
import p159f.p243f.p245b.p318c.p319a.p323d.C7634g;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.appupdate.j */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6300j implements C6288b {

    /* renamed from: a */
    private final C6311u f29290a;

    /* renamed from: b */
    private final C6297g f29291b;

    /* renamed from: c */
    private final Context f29292c;

    /* renamed from: d */
    private final Handler f29293d = new Handler(Looper.getMainLooper());

    C6300j(C6311u uVar, C6297g gVar, Context context) {
        this.f29290a = uVar;
        this.f29291b = gVar;
        this.f29292c = context;
    }

    /* renamed from: a */
    public final C7632e<Void> mo25155a() {
        return this.f29290a.mo25176f(this.f29292c.getPackageName());
    }

    /* renamed from: b */
    public final C7632e<C6286a> mo25156b() {
        return this.f29290a.mo25177g(this.f29292c.getPackageName());
    }

    /* renamed from: c */
    public final synchronized void mo25157c(C6461b bVar) {
        this.f29291b.mo28614c(bVar);
    }

    /* renamed from: d */
    public final C7632e<Integer> mo25158d(C6286a aVar, Activity activity, C6292d dVar) {
        if (aVar == null || activity == null || dVar == null || aVar.mo25149h()) {
            return C7634g.m42449b(new C6460a(-4));
        }
        if (!aVar.mo25145c(dVar)) {
            return C7634g.m42449b(new C6460a(-6));
        }
        aVar.mo25148g();
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", aVar.mo25147e(dVar));
        C7643p pVar = new C7643p();
        intent.putExtra("result_receiver", new zzd(this, this.f29293d, pVar));
        activity.startActivity(intent);
        return pVar.mo28632a();
    }

    /* renamed from: e */
    public final boolean mo25159e(C6286a aVar, int i, Activity activity, int i2) throws IntentSender.SendIntentException {
        C6292d c = C6292d.m37499c(i);
        if (activity == null) {
            return false;
        }
        return mo25169g(aVar, new C6299i(this, activity), c, i2);
    }

    /* renamed from: f */
    public final synchronized void mo25160f(C6461b bVar) {
        this.f29291b.mo28616e(bVar);
    }

    /* renamed from: g */
    public final boolean mo25169g(C6286a aVar, C6454a aVar2, C6292d dVar, int i) throws IntentSender.SendIntentException {
        if (aVar == null || aVar2 == null || dVar == null || !aVar.mo25145c(dVar) || aVar.mo25149h()) {
            return false;
        }
        aVar.mo25148g();
        aVar2.mo25168a(aVar.mo25147e(dVar).getIntentSender(), i, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }
}
