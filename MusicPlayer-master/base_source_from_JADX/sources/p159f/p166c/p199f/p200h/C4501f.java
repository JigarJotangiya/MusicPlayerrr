package p159f.p166c.p199f.p200h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import p159f.p166c.p199f.C4489c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.f.h.f */
/* compiled from: TextDrawableUtils */
public class C4501f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4505d f13111a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public View f13112b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Drawable f13113c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Drawable f13114d;

    /* renamed from: e */
    private View.OnTouchListener f13115e;

    /* renamed from: f.c.f.h.f$a */
    /* compiled from: TextDrawableUtils */
    class C4502a implements View.OnTouchListener {
        C4502a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1 || C4501f.this.f13111a == null) {
                return false;
            }
            if (C4501f.this.f13113c != null && (motionEvent.getRawX() <= ((float) (C4501f.this.f13112b.getLeft() + C4501f.this.f13113c.getBounds().width())) || motionEvent.getX() <= ((float) C4501f.this.f13113c.getBounds().width()))) {
                C4501f.this.f13111a.mo15202b(view, C4501f.this.f13113c);
                return true;
            } else if (C4501f.this.f13114d == null) {
                return false;
            } else {
                if (motionEvent.getRawX() < ((float) (C4501f.this.f13112b.getRight() - C4501f.this.f13114d.getBounds().width())) && motionEvent.getX() < ((float) (C4501f.this.f13112b.getWidth() - C4501f.this.f13114d.getBounds().width()))) {
                    return false;
                }
                C4501f.this.f13111a.mo15201a(view, C4501f.this.f13114d);
                return true;
            }
        }
    }

    /* renamed from: f.c.f.h.f$b */
    /* compiled from: TextDrawableUtils */
    static class C4503b implements C4505d {

        /* renamed from: a */
        final /* synthetic */ EditText f13117a;

        C4503b(EditText editText) {
            this.f13117a = editText;
        }

        /* renamed from: a */
        public void mo15201a(View view, Drawable drawable) {
        }

        /* renamed from: b */
        public void mo15202b(View view, Drawable drawable) {
            if (!TextUtils.isEmpty(this.f13117a.getText().toString())) {
                this.f13117a.setText(BuildConfig.FLAVOR);
            }
        }
    }

    /* renamed from: f.c.f.h.f$c */
    /* compiled from: TextDrawableUtils */
    static class C4504c implements C4505d {

        /* renamed from: a */
        final /* synthetic */ EditText f13118a;

        C4504c(EditText editText) {
            this.f13118a = editText;
        }

        /* renamed from: a */
        public void mo15201a(View view, Drawable drawable) {
            if (!TextUtils.isEmpty(this.f13118a.getText().toString())) {
                this.f13118a.setText(BuildConfig.FLAVOR);
            }
        }

        /* renamed from: b */
        public void mo15202b(View view, Drawable drawable) {
        }
    }

    /* renamed from: f.c.f.h.f$d */
    /* compiled from: TextDrawableUtils */
    public interface C4505d {
        /* renamed from: a */
        void mo15201a(View view, Drawable drawable);

        /* renamed from: b */
        void mo15202b(View view, Drawable drawable);
    }

    public C4501f(View view, C4505d dVar) {
        C4502a aVar = new C4502a();
        this.f13115e = aVar;
        this.f13112b = view;
        view.setOnTouchListener(aVar);
        this.f13111a = dVar;
        View view2 = this.f13112b;
        if (view2 instanceof TextView) {
            this.f13113c = ((TextView) view2).getCompoundDrawables()[0];
            this.f13114d = ((TextView) this.f13112b).getCompoundDrawables()[2];
        } else if (view2 instanceof EditText) {
            this.f13113c = ((EditText) view2).getCompoundDrawables()[0];
            this.f13114d = ((EditText) this.f13112b).getCompoundDrawables()[2];
        }
    }

    /* renamed from: e */
    public static void m19720e(Context context, EditText editText, boolean z) {
        Drawable drawable = context.getResources().getDrawable(C4489c.ic_delete_text);
        drawable.setBounds(0, 0, C4497c.m19710a(context, 16.0f), C4497c.m19710a(context, 16.0f));
        if (C4494a.m19696e()) {
            if (z) {
                editText.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                new C4501f(editText, new C4503b(editText));
                return;
            }
            editText.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (z) {
            editText.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            new C4501f(editText, new C4504c(editText));
        } else {
            editText.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }
}
