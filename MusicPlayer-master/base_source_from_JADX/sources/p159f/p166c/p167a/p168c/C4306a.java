package p159f.p166c.p167a.p168c;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.coocent.colorpicker.utils.C2221a;
import com.coocent.colorpicker.utils.ColorPickerPreference;
import com.coocent.colorpicker.view.ColorPickerPanelView;
import com.coocent.colorpicker.view.ColorPickerView;
import java.util.Locale;
import p159f.p166c.p167a.C4304a;
import p159f.p166c.p167a.C4305b;
import p159f.p166c.p167a.p170e.C4311b;

/* renamed from: f.c.a.c.a */
/* compiled from: ColorPickerDialog */
public class C4306a extends Dialog implements ColorPickerView.C2223a, View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: g */
    private C4311b f12862g;

    /* renamed from: h */
    private boolean f12863h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ColorPickerView f12864i;

    /* renamed from: j */
    private ColorPickerPanelView f12865j;

    /* renamed from: k */
    private ColorPickerPanelView f12866k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public EditText f12867l;

    /* renamed from: m */
    private boolean f12868m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ColorStateList f12869n;

    /* renamed from: o */
    private C4308b f12870o;

    /* renamed from: p */
    private int f12871p;

    /* renamed from: q */
    private View f12872q;

    /* renamed from: f.c.a.c.a$a */
    /* compiled from: ColorPickerDialog */
    class C4307a implements TextView.OnEditorActionListener {
        C4307a() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            ((InputMethodManager) textView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            String obj = C4306a.this.f12867l.getText().toString();
            if (obj.length() > 5 || obj.length() < 10) {
                try {
                    C4306a.this.f12864i.mo8802q(ColorPickerPreference.m10320j(obj.toString()), true);
                    C4306a.this.f12867l.setTextColor(C4306a.this.f12869n);
                } catch (IllegalArgumentException unused) {
                    C4306a.this.f12867l.setTextColor(-65536);
                }
            } else {
                C4306a.this.f12867l.setTextColor(-65536);
            }
            return true;
        }
    }

    /* renamed from: f.c.a.c.a$b */
    /* compiled from: ColorPickerDialog */
    public interface C4308b {
        /* renamed from: c */
        void mo8769c();

        /* renamed from: d */
        void mo8770d(int i, String str);
    }

    public C4306a(Context context, int i) {
        this(context, i, false, (C4311b) null);
    }

    /* renamed from: p */
    private void m18813p(int i) {
        getWindow().setFormat(1);
        m18814t(i);
    }

    /* renamed from: t */
    private void m18814t(int i) {
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C4305b.marquee_dialog_color_picker, (ViewGroup) null);
        this.f12872q = inflate;
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f12871p = getContext().getResources().getConfiguration().orientation;
        setContentView(this.f12872q);
        this.f12864i = (ColorPickerView) this.f12872q.findViewById(C4304a.color_picker_view);
        this.f12865j = (ColorPickerPanelView) this.f12872q.findViewById(C4304a.old_color_panel);
        this.f12866k = (ColorPickerPanelView) this.f12872q.findViewById(C4304a.new_color_panel);
        this.f12867l = (EditText) this.f12872q.findViewById(C4304a.hex_val);
        TextView textView = (TextView) this.f12872q.findViewById(C4304a.save);
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) this.f12872q.findViewById(C4304a.cancel);
        textView2.setOnClickListener(this);
        TextView textView3 = (TextView) this.f12872q.findViewById(C4304a.delete);
        textView3.setOnClickListener(this);
        TextView textView4 = (TextView) this.f12872q.findViewById(C4304a.title);
        C4311b bVar = this.f12862g;
        if (bVar != null) {
            if (bVar.mo14677a() != 0) {
                this.f12872q.setBackgroundColor(this.f12862g.mo14677a());
            }
            if (this.f12862g.mo14681e() != 0) {
                textView4.setTextColor(this.f12862g.mo14681e());
                this.f12867l.setTextColor(this.f12862g.mo14681e());
            }
            if (this.f12862g.mo14680d() != 0) {
                textView.setTextColor(this.f12862g.mo14680d());
                textView3.setTextColor(this.f12862g.mo14680d());
                textView2.setTextColor(this.f12862g.mo14680d());
            }
            if (this.f12862g.mo14678b() != null) {
                C2221a.C2222a aVar = C2221a.f7456a;
                aVar.mo8783a(textView2, this.f12862g.mo14678b());
                aVar.mo8783a(textView, this.f12862g.mo14678b());
                aVar.mo8783a(textView3, this.f12862g.mo14678b());
            } else if (Build.VERSION.SDK_INT >= 21 && this.f12862g.mo14679c() != null) {
                C2221a.C2222a aVar2 = C2221a.f7456a;
                aVar2.mo8783a(textView2, this.f12862g.mo14679c());
                aVar2.mo8783a(textView, this.f12862g.mo14679c());
                aVar2.mo8783a(textView3, this.f12862g.mo14679c());
            }
        }
        textView3.setVisibility(this.f12863h ? 0 : 8);
        this.f12867l.setInputType(524288);
        this.f12869n = this.f12867l.getTextColors();
        this.f12867l.setOnEditorActionListener(new C4307a());
        ((LinearLayout) this.f12865j.getParent()).setPadding(Math.round(this.f12864i.getDrawingOffset()), 0, Math.round(this.f12864i.getDrawingOffset()), 0);
        this.f12864i.setOnColorChangedListener(this);
        this.f12865j.setColor(i);
        this.f12864i.mo8802q(i, true);
    }

    /* renamed from: u */
    private void m18815u() {
        if (mo14660n()) {
            this.f12867l.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
            return;
        }
        this.f12867l.setFilters(new InputFilter[]{new InputFilter.LengthFilter(7)});
    }

    /* renamed from: v */
    private void m18816v(int i) {
        if (mo14660n()) {
            this.f12867l.setText(ColorPickerPreference.m10319h(i).toUpperCase(Locale.getDefault()));
        } else {
            this.f12867l.setText(ColorPickerPreference.m10321k(i).toUpperCase(Locale.getDefault()));
        }
        this.f12867l.setTextColor(this.f12869n);
    }

    /* renamed from: a */
    public void mo8810a(int i) {
        String.format("#%08X", new Object[]{Integer.valueOf(i)});
        this.f12866k.setColor(i);
        if (this.f12868m) {
            m18816v(i);
        }
    }

    /* renamed from: n */
    public boolean mo14660n() {
        return this.f12864i.getAlphaSliderVisible();
    }

    /* renamed from: o */
    public int mo14661o() {
        return this.f12864i.getColor();
    }

    public void onClick(View view) {
        C4308b bVar;
        if (view.getId() == C4304a.new_color_panel || view.getId() == C4304a.save) {
            C4308b bVar2 = this.f12870o;
            if (bVar2 != null) {
                bVar2.mo8770d(this.f12866k.getColor(), String.format("#%08X", new Object[]{Integer.valueOf(this.f12866k.getColor())}));
            }
        } else if (view.getId() == C4304a.delete && (bVar = this.f12870o) != null) {
            bVar.mo8769c();
        }
        dismiss();
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null && inputMethodManager.isActive()) {
            EditText editText = this.f12867l;
            inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(getContext().getResources().getIdentifier("android:id/titleDivider", (String) null, (String) null));
        if (findViewById != null) {
            findViewById.setBackgroundColor(0);
        }
        Window window = getWindow();
        if (window != null) {
            try {
                window.setBackgroundDrawable(new ColorDrawable(0));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void onGlobalLayout() {
        if (getContext().getResources().getConfiguration().orientation != this.f12871p) {
            int color = this.f12865j.getColor();
            int color2 = this.f12866k.getColor();
            this.f12872q.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            m18814t(color);
            this.f12866k.setColor(color2);
            this.f12864i.setColor(color2);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f12865j.setColor(bundle.getInt("old_color"));
        this.f12864i.mo8802q(bundle.getInt("new_color"), true);
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.putInt("old_color", this.f12865j.getColor());
        onSaveInstanceState.putInt("new_color", this.f12866k.getColor());
        return onSaveInstanceState;
    }

    public void onStart() {
        super.onStart();
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int width = window.getWindowManager().getDefaultDisplay().getWidth();
        attributes.gravity = 1;
        attributes.width = (int) (((float) width) * 0.9f);
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    /* renamed from: q */
    public void mo14668q(boolean z) {
        this.f12864i.setAlphaSliderVisible(z);
        if (this.f12868m) {
            m18815u();
            m18816v(mo14661o());
        }
    }

    /* renamed from: r */
    public void mo14669r(boolean z) {
        this.f12868m = z;
        if (z) {
            this.f12867l.setVisibility(0);
            m18815u();
            m18816v(mo14661o());
            return;
        }
        this.f12867l.setVisibility(8);
    }

    /* renamed from: s */
    public void mo14670s(C4308b bVar) {
        this.f12870o = bVar;
    }

    public C4306a(Context context, int i, boolean z, C4311b bVar) {
        super(context);
        this.f12863h = false;
        this.f12868m = false;
        this.f12863h = z;
        this.f12862g = bVar;
        m18813p(i);
    }
}
