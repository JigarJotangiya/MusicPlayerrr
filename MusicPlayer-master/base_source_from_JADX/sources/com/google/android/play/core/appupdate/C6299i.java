package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.play.core.common.C6454a;

/* renamed from: com.google.android.play.core.appupdate.i */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6299i implements C6454a {

    /* renamed from: a */
    final /* synthetic */ Activity f29289a;

    C6299i(C6300j jVar, Activity activity) {
        this.f29289a = activity;
    }

    /* renamed from: a */
    public final void mo25168a(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.f29289a.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
