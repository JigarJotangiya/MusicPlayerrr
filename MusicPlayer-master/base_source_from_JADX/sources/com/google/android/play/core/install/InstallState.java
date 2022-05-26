package com.google.android.play.core.install;

import android.content.Intent;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;

/* compiled from: com.google.android.play:core@@1.10.2 */
public abstract class InstallState {
    /* renamed from: f */
    public static InstallState m37831f(Intent intent, C7577a aVar) {
        Intent intent2 = intent;
        C7577a aVar2 = aVar;
        aVar2.mo28574a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        aVar2.mo28574a("Key: %s; value: %s", "install.status", Integer.valueOf(intent2.getIntExtra("install.status", 0)));
        aVar2.mo28574a("Key: %s; value: %s", "error.code", Integer.valueOf(intent2.getIntExtra("error.code", 0)));
        return new C6463d(intent2.getIntExtra("install.status", 0), intent2.getLongExtra("bytes.downloaded", 0), intent2.getLongExtra("total.bytes.to.download", 0), intent2.getIntExtra("error.code", 0), intent2.getStringExtra("package.name"));
    }

    /* renamed from: a */
    public abstract long mo25385a();

    /* renamed from: b */
    public abstract int mo25386b();

    /* renamed from: c */
    public abstract int mo25387c();

    /* renamed from: d */
    public abstract String mo25388d();

    /* renamed from: e */
    public abstract long mo25389e();
}
