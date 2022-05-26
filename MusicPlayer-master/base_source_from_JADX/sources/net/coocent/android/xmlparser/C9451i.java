package net.coocent.android.xmlparser;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: net.coocent.android.xmlparser.i */
/* compiled from: lambda */
public final /* synthetic */ class C9451i implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ Activity f36401g;

    /* renamed from: h */
    public final /* synthetic */ C9483n f36402h;

    /* renamed from: i */
    public final /* synthetic */ View f36403i;

    /* renamed from: j */
    public final /* synthetic */ ImageView f36404j;

    /* renamed from: k */
    public final /* synthetic */ TextView f36405k;

    /* renamed from: l */
    public final /* synthetic */ int f36406l;

    public /* synthetic */ C9451i(Activity activity, C9483n nVar, View view, ImageView imageView, TextView textView, int i) {
        this.f36401g = activity;
        this.f36402h = nVar;
        this.f36403i = view;
        this.f36404j = imageView;
        this.f36405k = textView;
        this.f36406l = i;
    }

    public final void run() {
        C9502v.m49910E(this.f36401g, this.f36402h, this.f36403i, this.f36404j, this.f36405k, this.f36406l);
    }
}
