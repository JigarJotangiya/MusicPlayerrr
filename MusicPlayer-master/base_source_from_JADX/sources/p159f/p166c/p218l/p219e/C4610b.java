package p159f.p166c.p218l.p219e;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* renamed from: f.c.l.e.b */
/* compiled from: SleepBaseDialog */
public abstract class C4610b extends Dialog {
    public C4610b(Context context) {
        this(context, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo15347a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo15348b(View view);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        View inflate = LayoutInflater.from(getContext()).inflate(mo15347a(), (ViewGroup) null);
        setContentView(inflate);
        mo15348b(inflate);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        getWindow().setGravity(17);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.gravity = 17;
        attributes.width = (int) (((float) getContext().getResources().getDisplayMetrics().widthPixels) * 0.85f);
        attributes.height = -2;
        getWindow().setAttributes(attributes);
    }

    public C4610b(Context context, int i) {
        super(context, i);
    }
}
