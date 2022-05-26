package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0188n;
import androidx.appcompat.widget.C0279g0;
import p082e.p083a.C3400a;
import p082e.p083a.C3405f;
import p082e.p083a.C3406g;
import p082e.p083a.C3409j;
import p082e.p109h.p119p.C3774v;

public class ListMenuItemView extends LinearLayout implements C0188n.C0189a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: g */
    private C0175i f573g;

    /* renamed from: h */
    private ImageView f574h;

    /* renamed from: i */
    private RadioButton f575i;

    /* renamed from: j */
    private TextView f576j;

    /* renamed from: k */
    private CheckBox f577k;

    /* renamed from: l */
    private TextView f578l;

    /* renamed from: m */
    private ImageView f579m;

    /* renamed from: n */
    private ImageView f580n;

    /* renamed from: o */
    private LinearLayout f581o;

    /* renamed from: p */
    private Drawable f582p;

    /* renamed from: q */
    private int f583q;

    /* renamed from: r */
    private Context f584r;

    /* renamed from: s */
    private boolean f585s;

    /* renamed from: t */
    private Drawable f586t;

    /* renamed from: u */
    private boolean f587u;

    /* renamed from: v */
    private LayoutInflater f588v;

    /* renamed from: w */
    private boolean f589w;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.listMenuViewStyle);
    }

    /* renamed from: a */
    private void m904a(View view) {
        m905b(view, -1);
    }

    /* renamed from: b */
    private void m905b(View view, int i) {
        LinearLayout linearLayout = this.f581o;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    private void m906c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C3406g.abc_list_menu_item_checkbox, this, false);
        this.f577k = checkBox;
        m904a(checkBox);
    }

    /* renamed from: e */
    private void m907e() {
        ImageView imageView = (ImageView) getInflater().inflate(C3406g.abc_list_menu_item_icon, this, false);
        this.f574h = imageView;
        m905b(imageView, 0);
    }

    /* renamed from: f */
    private void m908f() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C3406g.abc_list_menu_item_radio, this, false);
        this.f575i = radioButton;
        m904a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f588v == null) {
            this.f588v = LayoutInflater.from(getContext());
        }
        return this.f588v;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f579m;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f580n;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f580n.getLayoutParams();
            rect.top += this.f580n.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: d */
    public boolean mo720d() {
        return false;
    }

    /* renamed from: g */
    public void mo746g(boolean z, char c) {
        int i = (!z || !this.f573g.mo963A()) ? 8 : 0;
        if (i == 0) {
            this.f578l.setText(this.f573g.mo980h());
        }
        if (this.f578l.getVisibility() != i) {
            this.f578l.setVisibility(i);
        }
    }

    public C0175i getItemData() {
        return this.f573g;
    }

    /* renamed from: n */
    public void mo722n(C0175i iVar, int i) {
        this.f573g = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.mo982i(this));
        setCheckable(iVar.isCheckable());
        mo746g(iVar.mo963A(), iVar.mo967g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C3774v.m16223r0(this, this.f582p);
        TextView textView = (TextView) findViewById(C3405f.title);
        this.f576j = textView;
        int i = this.f583q;
        if (i != -1) {
            textView.setTextAppearance(this.f584r, i);
        }
        this.f578l = (TextView) findViewById(C3405f.shortcut);
        ImageView imageView = (ImageView) findViewById(C3405f.submenuarrow);
        this.f579m = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f586t);
        }
        this.f580n = (ImageView) findViewById(C3405f.group_divider);
        this.f581o = (LinearLayout) findViewById(C3405f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f574h != null && this.f585s) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f574h.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f575i != null || this.f577k != null) {
            if (this.f573g.mo990m()) {
                if (this.f575i == null) {
                    m908f();
                }
                compoundButton2 = this.f575i;
                compoundButton = this.f577k;
            } else {
                if (this.f577k == null) {
                    m906c();
                }
                compoundButton2 = this.f577k;
                compoundButton = this.f575i;
            }
            if (z) {
                compoundButton2.setChecked(this.f573g.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f577k;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f575i;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f573g.mo990m()) {
            if (this.f575i == null) {
                m908f();
            }
            compoundButton = this.f575i;
        } else {
            if (this.f577k == null) {
                m906c();
            }
            compoundButton = this.f577k;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f589w = z;
        this.f585s = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f580n;
        if (imageView != null) {
            imageView.setVisibility((this.f587u || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f573g.mo1020z() || this.f589w;
        if (z || this.f585s) {
            ImageView imageView = this.f574h;
            if (imageView != null || drawable != null || this.f585s) {
                if (imageView == null) {
                    m907e();
                }
                if (drawable != null || this.f585s) {
                    ImageView imageView2 = this.f574h;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f574h.getVisibility() != 0) {
                        this.f574h.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f574h.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f576j.setText(charSequence);
            if (this.f576j.getVisibility() != 0) {
                this.f576j.setVisibility(0);
            }
        } else if (this.f576j.getVisibility() != 8) {
            this.f576j.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0279g0 v = C0279g0.m1627v(getContext(), attributeSet, C3409j.MenuView, i, 0);
        this.f582p = v.mo1982g(C3409j.MenuView_android_itemBackground);
        this.f583q = v.mo1989n(C3409j.MenuView_android_itemTextAppearance, -1);
        this.f585s = v.mo1976a(C3409j.MenuView_preserveIconSpacing, false);
        this.f584r = context;
        this.f586t = v.mo1982g(C3409j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C3400a.dropDownListViewStyle, 0);
        this.f587u = obtainStyledAttributes.hasValue(0);
        v.mo1995w();
        obtainStyledAttributes.recycle();
    }
}
