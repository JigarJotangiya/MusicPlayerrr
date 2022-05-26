package com.coocent.music.base.p056ui.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import p159f.p166c.p181e.p182a.p183a.p184a.C4361a;
import p159f.p166c.p181e.p182a.p190b.C4452f;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.coocent.music.base.ui.activity.BindLyricDialogActivity */
/* compiled from: BindLyricDialogActivity.kt */
public final class BindLyricDialogActivity extends AppCompatActivity implements C4361a {

    /* renamed from: z */
    private String f8237z = BuildConfig.FLAVOR;

    /* renamed from: d2 */
    private final void m11065d2() {
        String stringExtra = getIntent().getStringExtra("musicName");
        if (stringExtra == null) {
            stringExtra = BuildConfig.FLAVOR;
        }
        this.f8237z = stringExtra;
    }

    /* renamed from: k2 */
    private final void m11070k2() {
        Window window = getWindow();
        window.setGravity(8388659);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        attributes.height = 1;
        attributes.width = 1;
        window.setAttributes(attributes);
    }

    /* renamed from: l2 */
    private final void m11071l2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(C4452f.bind_lyric);
        builder.setMessage(C4452f.bind_lyric_tip);
        builder.setPositiveButton(C4452f.local_s, new C2357g(this));
        builder.setNegativeButton(C4452f.button2, new C2356f(this));
        builder.setNeutralButton(C4452f.button1, new C2358h(this));
        AlertDialog create = builder.create();
        create.setOnDismissListener(new C2355e(this));
        create.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m11072m2(BindLyricDialogActivity bindLyricDialogActivity, DialogInterface dialogInterface, int i) {
        C8594l.m46771e(bindLyricDialogActivity, "this$0");
        C4477c.m19588N0(bindLyricDialogActivity, bindLyricDialogActivity.mo9268e2(), bindLyricDialogActivity);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m11073n2(BindLyricDialogActivity bindLyricDialogActivity, DialogInterface dialogInterface, int i) {
        C8594l.m46771e(bindLyricDialogActivity, "this$0");
        C4477c.m19586M0(bindLyricDialogActivity, bindLyricDialogActivity.mo9268e2());
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m11074o2(BindLyricDialogActivity bindLyricDialogActivity, DialogInterface dialogInterface, int i) {
        C8594l.m46771e(bindLyricDialogActivity, "this$0");
        C4477c.m19632m0(bindLyricDialogActivity.mo9268e2(), bindLyricDialogActivity);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m11075p2(BindLyricDialogActivity bindLyricDialogActivity, DialogInterface dialogInterface) {
        C8594l.m46771e(bindLyricDialogActivity, "this$0");
        bindLyricDialogActivity.finish();
    }

    /* renamed from: e2 */
    public final String mo9268e2() {
        return this.f8237z;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C4477c.m19608a0(this, i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m11065d2();
        m11070k2();
        m11071l2();
    }

    /* renamed from: x0 */
    public void mo9270x0(boolean z) {
        Log.e("bindLyricToRefresh", C8594l.m46777k("success:", Boolean.valueOf(z)));
        sendBroadcast(new Intent(C8594l.m46777k(getPackageName(), ".parser_lyric")));
    }
}
