package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p082e.p083a.C3400a;
import p082e.p083a.p090o.C3432b;
import p082e.p109h.p119p.C3755f;

/* renamed from: androidx.appcompat.app.f */
/* compiled from: AppCompatDialog */
public class C0137f extends Dialog implements C0135d {

    /* renamed from: g */
    private C0136e f472g;

    /* renamed from: h */
    private final C3755f.C3756a f473h = new C0138a();

    /* renamed from: androidx.appcompat.app.f$a */
    /* compiled from: AppCompatDialog */
    class C0138a implements C3755f.C3756a {
        C0138a() {
        }

        /* renamed from: Z0 */
        public boolean mo662Z0(KeyEvent keyEvent) {
            return C0137f.this.mo651c(keyEvent);
        }
    }

    public C0137f(Context context, int i) {
        super(context, m758b(context, i));
        C0136e a = mo649a();
        a.mo517H(m758b(context, i));
        a.mo553s((Bundle) null);
    }

    /* renamed from: b */
    private static int m758b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C3400a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: F0 */
    public C3432b mo466F0(C3432b.C3433a aVar) {
        return null;
    }

    /* renamed from: L */
    public void mo467L(C3432b bVar) {
    }

    /* renamed from: S */
    public void mo472S(C3432b bVar) {
    }

    /* renamed from: a */
    public C0136e mo649a() {
        if (this.f472g == null) {
            this.f472g = C0136e.m728h(this, this);
        }
        return this.f472g;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo649a().mo535d(view, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo651c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: d */
    public boolean mo652d(int i) {
        return mo649a().mo510B(i);
    }

    public void dismiss() {
        super.dismiss();
        mo649a().mo555t();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C3755f.m16085e(this.f473h, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return mo649a().mo539i(i);
    }

    public void invalidateOptionsMenu() {
        mo649a().mo550p();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo649a().mo547o();
        super.onCreate(bundle);
        mo649a().mo553s(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo649a().mo564y();
    }

    public void setContentView(int i) {
        mo649a().mo512D(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo649a().mo518I(charSequence);
    }

    public void setContentView(View view) {
        mo649a().mo514E(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo649a().mo515F(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo649a().mo518I(getContext().getString(i));
    }
}
