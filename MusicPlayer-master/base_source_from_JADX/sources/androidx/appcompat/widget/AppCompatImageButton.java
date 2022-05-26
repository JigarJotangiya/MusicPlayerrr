package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.core.widget.C0560o;
import p082e.p083a.C3400a;
import p082e.p109h.p119p.C3772t;

public class AppCompatImageButton extends ImageButton implements C3772t, C0560o {

    /* renamed from: g */
    private final C0271d f938g;

    /* renamed from: h */
    private final C0280h f939h;

    public AppCompatImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0271d dVar = this.f938g;
        if (dVar != null) {
            dVar.mo1944b();
        }
        C0280h hVar = this.f939h;
        if (hVar != null) {
            hVar.mo1996b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0271d dVar = this.f938g;
        if (dVar != null) {
            return dVar.mo1945c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0271d dVar = this.f938g;
        if (dVar != null) {
            return dVar.mo1946d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0280h hVar = this.f939h;
        if (hVar != null) {
            return hVar.mo1997c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0280h hVar = this.f939h;
        if (hVar != null) {
            return hVar.mo1998d();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f939h.mo1999e() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0271d dVar = this.f938g;
        if (dVar != null) {
            dVar.mo1948f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0271d dVar = this.f938g;
        if (dVar != null) {
            dVar.mo1949g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0280h hVar = this.f939h;
        if (hVar != null) {
            hVar.mo1996b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0280h hVar = this.f939h;
        if (hVar != null) {
            hVar.mo1996b();
        }
    }

    public void setImageResource(int i) {
        this.f939h.mo2001g(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0280h hVar = this.f939h;
        if (hVar != null) {
            hVar.mo1996b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0271d dVar = this.f938g;
        if (dVar != null) {
            dVar.mo1951i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0271d dVar = this.f938g;
        if (dVar != null) {
            dVar.mo1952j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0280h hVar = this.f939h;
        if (hVar != null) {
            hVar.mo2002h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0280h hVar = this.f939h;
        if (hVar != null) {
            hVar.mo2003i(mode);
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.imageButtonStyle);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(C0272d0.m1593b(context), attributeSet, i);
        C0268b0.m1570a(this, getContext());
        C0271d dVar = new C0271d(this);
        this.f938g = dVar;
        dVar.mo1947e(attributeSet, i);
        C0280h hVar = new C0280h(this);
        this.f939h = hVar;
        hVar.mo2000f(attributeSet, i);
    }
}
