package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p082e.p083a.C3400a;

/* renamed from: androidx.appcompat.app.c */
/* compiled from: AlertDialog */
public class C0133c extends C0137f implements DialogInterface {

    /* renamed from: i */
    final AlertController f466i = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.c$a */
    /* compiled from: AlertDialog */
    public static class C0134a {

        /* renamed from: a */
        private final AlertController.C0093f f467a;

        /* renamed from: b */
        private final int f468b;

        public C0134a(Context context) {
            this(context, C0133c.m700g(context, 0));
        }

        /* renamed from: a */
        public C0133c mo630a() {
            C0133c cVar = new C0133c(this.f467a.f308a, this.f468b);
            this.f467a.mo456a(cVar.f466i);
            cVar.setCancelable(this.f467a.f325r);
            if (this.f467a.f325r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f467a.f326s);
            cVar.setOnDismissListener(this.f467a.f327t);
            DialogInterface.OnKeyListener onKeyListener = this.f467a.f328u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        /* renamed from: b */
        public Context mo631b() {
            return this.f467a.f308a;
        }

        /* renamed from: c */
        public C0134a mo632c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0093f fVar = this.f467a;
            fVar.f330w = listAdapter;
            fVar.f331x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C0134a mo633d(boolean z) {
            this.f467a.f325r = z;
            return this;
        }

        /* renamed from: e */
        public C0134a mo634e(View view) {
            this.f467a.f314g = view;
            return this;
        }

        /* renamed from: f */
        public C0134a mo635f(Drawable drawable) {
            this.f467a.f311d = drawable;
            return this;
        }

        /* renamed from: g */
        public C0134a mo636g(int i) {
            AlertController.C0093f fVar = this.f467a;
            fVar.f315h = fVar.f308a.getText(i);
            return this;
        }

        /* renamed from: h */
        public C0134a mo637h(CharSequence charSequence) {
            this.f467a.f315h = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0134a mo638i(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0093f fVar = this.f467a;
            fVar.f319l = fVar.f308a.getText(i);
            this.f467a.f321n = onClickListener;
            return this;
        }

        /* renamed from: j */
        public C0134a mo639j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0093f fVar = this.f467a;
            fVar.f319l = charSequence;
            fVar.f321n = onClickListener;
            return this;
        }

        /* renamed from: k */
        public C0134a mo640k(DialogInterface.OnKeyListener onKeyListener) {
            this.f467a.f328u = onKeyListener;
            return this;
        }

        /* renamed from: l */
        public C0134a mo641l(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0093f fVar = this.f467a;
            fVar.f316i = fVar.f308a.getText(i);
            this.f467a.f318k = onClickListener;
            return this;
        }

        /* renamed from: m */
        public C0134a mo642m(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0093f fVar = this.f467a;
            fVar.f316i = charSequence;
            fVar.f318k = onClickListener;
            return this;
        }

        /* renamed from: n */
        public C0134a mo643n(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0093f fVar = this.f467a;
            fVar.f330w = listAdapter;
            fVar.f331x = onClickListener;
            fVar.f301I = i;
            fVar.f300H = true;
            return this;
        }

        /* renamed from: o */
        public C0134a mo644o(int i) {
            AlertController.C0093f fVar = this.f467a;
            fVar.f313f = fVar.f308a.getText(i);
            return this;
        }

        /* renamed from: p */
        public C0134a mo645p(CharSequence charSequence) {
            this.f467a.f313f = charSequence;
            return this;
        }

        /* renamed from: q */
        public C0134a mo646q(View view) {
            AlertController.C0093f fVar = this.f467a;
            fVar.f333z = view;
            fVar.f332y = 0;
            fVar.f297E = false;
            return this;
        }

        /* renamed from: r */
        public C0133c mo647r() {
            C0133c a = mo630a();
            a.show();
            return a;
        }

        public C0134a(Context context, int i) {
            this.f467a = new AlertController.C0093f(new ContextThemeWrapper(context, C0133c.m700g(context, i)));
            this.f468b = i;
        }
    }

    protected C0133c(Context context, int i) {
        super(context, m700g(context, i));
    }

    /* renamed from: g */
    static int m700g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C3400a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public Button mo624e(int i) {
        return this.f466i.mo434c(i);
    }

    /* renamed from: f */
    public ListView mo625f() {
        return this.f466i.mo436e();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f466i.mo437f();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f466i.mo438h(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f466i.mo439i(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f466i.mo445r(charSequence);
    }
}
