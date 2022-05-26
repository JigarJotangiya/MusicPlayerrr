package net.coocent.android.xmlparser.p459x;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0137f;
import androidx.appcompat.widget.AppCompatImageView;
import java.lang.ref.WeakReference;
import p082e.p083a.C3400a;

/* renamed from: net.coocent.android.xmlparser.x.a */
/* compiled from: BaseDialog */
public class C9558a extends C0137f {

    /* renamed from: i */
    private View f36710i;

    /* renamed from: j */
    private float f36711j;

    /* renamed from: k */
    private boolean f36712k;

    /* renamed from: l */
    private boolean f36713l;

    /* renamed from: net.coocent.android.xmlparser.x.a$a */
    /* compiled from: BaseDialog */
    public static final class C9559a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public WeakReference<Context> f36714a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public View f36715b;

        /* renamed from: c */
        private int f36716c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public float f36717d = 0.96f;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f36718e = true;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f36719f = true;

        public C9559a(Context context, int i) {
            this.f36714a = new WeakReference<>(context);
            if (i == 0) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(C3400a.alertDialogTheme, typedValue, true);
                this.f36716c = typedValue.resourceId;
                return;
            }
            this.f36716c = i;
        }

        /* renamed from: f */
        public C9558a mo32941f() {
            return new C9558a(this, this.f36716c);
        }

        /* renamed from: g */
        public C9559a mo32942g(boolean z) {
            this.f36718e = z;
            return this;
        }

        /* renamed from: h */
        public C9559a mo32943h(boolean z) {
            this.f36719f = z;
            return this;
        }

        /* renamed from: i */
        public C9559a mo32944i(int i) {
            this.f36715b = LayoutInflater.from((Context) this.f36714a.get()).inflate(i, (ViewGroup) null);
            return this;
        }

        /* renamed from: j */
        public C9559a mo32945j(float f) {
            this.f36717d = f;
            return this;
        }
    }

    public C9558a(C9559a aVar, int i) {
        super((Context) aVar.f36714a.get(), i);
        this.f36710i = aVar.f36715b;
        this.f36711j = aVar.f36717d;
        this.f36712k = aVar.f36718e;
        this.f36713l = aVar.f36719f;
        TypedValue typedValue = new TypedValue();
        ((Context) aVar.f36714a.get()).getTheme().resolveAttribute(C3400a.alertDialogTheme, typedValue, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, new int[]{C3400a.isLightTheme});
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        mo652d(1);
    }

    /* renamed from: e */
    public void mo32936e(int i, View.OnClickListener onClickListener) {
        this.f36710i.findViewById(i).setOnClickListener(onClickListener);
    }

    /* renamed from: f */
    public View mo32937f() {
        return this.f36710i;
    }

    /* renamed from: g */
    public void mo32938g(int i, Bitmap bitmap) {
        ((AppCompatImageView) this.f36710i.findViewById(i)).setImageBitmap(bitmap);
    }

    /* renamed from: h */
    public void mo32939h(int i, int i2) {
        this.f36710i.findViewById(i).setVisibility(i2);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f36710i);
        setCancelable(this.f36712k);
        setCanceledOnTouchOutside(this.f36713l);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((float) displayMetrics.widthPixels) * this.f36711j);
            window.setAttributes(attributes);
        }
    }
}
