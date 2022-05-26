package com.miguelcatalan.materialsearchview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.coocent.music.base.data.entity.Music;
import com.miguelcatalan.materialsearchview.p269c.C6757a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.C7941a;
import p342g.p343a.p344a.p346c.C7962o;
import p342g.p343a.p344a.p358i.C8345u;

public class MaterialSearchView extends FrameLayout implements Filter.FilterListener {

    /* renamed from: A */
    private boolean f30201A;

    /* renamed from: B */
    private Drawable f30202B;

    /* renamed from: C */
    private Context f30203C;

    /* renamed from: D */
    private ArrayList<Music> f30204D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f30205E;

    /* renamed from: F */
    private final View.OnClickListener f30206F;

    /* renamed from: g */
    private MenuItem f30207g;

    /* renamed from: h */
    private boolean f30208h;

    /* renamed from: i */
    private int f30209i;

    /* renamed from: j */
    private boolean f30210j;

    /* renamed from: k */
    protected View f30211k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public View f30212l;

    /* renamed from: m */
    private ListView f30213m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public EditText f30214n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ImageButton f30215o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ImageButton f30216p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public ImageButton f30217q;

    /* renamed from: r */
    private RelativeLayout f30218r;

    /* renamed from: s */
    private CharSequence f30219s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public CharSequence f30220t;

    /* renamed from: u */
    private C6751h f30221u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C6752i f30222v;

    /* renamed from: w */
    private ListAdapter f30223w;

    /* renamed from: x */
    private SavedState f30224x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f30225y;

    /* renamed from: z */
    private boolean f30226z;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6743a();

        /* renamed from: g */
        String f30227g;

        /* renamed from: h */
        boolean f30228h;

        /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$SavedState$a */
        class C6743a implements Parcelable.Creator<SavedState> {
            C6743a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C6753a) null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C6753a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f30227g);
            parcel.writeInt(this.f30228h ? 1 : 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f30227g = parcel.readString();
            this.f30228h = parcel.readInt() != 1 ? false : true;
        }
    }

    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$a */
    class C6744a implements TextView.OnEditorActionListener {
        C6744a() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            MaterialSearchView.this.m38566v();
            return true;
        }
    }

    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$b */
    class C6745b implements TextWatcher {
        C6745b() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CharSequence unused = MaterialSearchView.this.f30220t = charSequence;
            MaterialSearchView.this.m38548G(charSequence);
            MaterialSearchView.this.m38567w(charSequence);
        }
    }

    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$c */
    class C6746c implements View.OnFocusChangeListener {
        C6746c() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                MaterialSearchView materialSearchView = MaterialSearchView.this;
                materialSearchView.mo26252B(materialSearchView.f30214n);
                MaterialSearchView.this.mo26255E();
            }
        }
    }

    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$d */
    class C6747d implements View.OnClickListener {
        C6747d() {
        }

        public void onClick(View view) {
            if (view == MaterialSearchView.this.f30215o) {
                MaterialSearchView.this.mo26258n();
            } else if (view == MaterialSearchView.this.f30216p) {
                MaterialSearchView.this.m38568x();
            } else if (view == MaterialSearchView.this.f30217q) {
                MaterialSearchView.this.f30214n.setText((CharSequence) null);
            } else if (view != MaterialSearchView.this.f30214n && view == MaterialSearchView.this.f30212l) {
                MaterialSearchView.this.mo26258n();
            }
        }
    }

    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$e */
    class C6748e implements AdapterView.OnItemClickListener {

        /* renamed from: g */
        final /* synthetic */ C6754b f30233g;

        C6748e(C6754b bVar) {
            this.f30233g = bVar;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int unused = MaterialSearchView.this.f30205E = i;
            MaterialSearchView.this.mo26289z((String) this.f30233g.getItem(i), MaterialSearchView.this.f30225y);
        }
    }

    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$f */
    class C6749f implements MenuItem.OnMenuItemClickListener {
        C6749f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MaterialSearchView.this.mo26253C();
            return true;
        }
    }

    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$g */
    class C6750g implements C6757a.C6760c {
        C6750g() {
        }

        /* renamed from: a */
        public boolean mo26303a(View view) {
            return false;
        }

        /* renamed from: b */
        public boolean mo26304b(View view) {
            if (MaterialSearchView.this.f30222v == null) {
                return false;
            }
            MaterialSearchView.this.f30222v.mo26308a();
            return false;
        }

        /* renamed from: c */
        public boolean mo26305c(View view) {
            return false;
        }
    }

    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$h */
    public interface C6751h {
        /* renamed from: a */
        boolean mo26306a(String str);

        /* renamed from: b */
        boolean mo26307b(String str);
    }

    /* renamed from: com.miguelcatalan.materialsearchview.MaterialSearchView$i */
    public interface C6752i {
        /* renamed from: a */
        void mo26308a();

        /* renamed from: b */
        void mo26309b();
    }

    public MaterialSearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    private void m38547A() {
        C6750g gVar = new C6750g();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f30211k.setVisibility(0);
            C6757a.m38593b(this.f30218r, gVar);
            return;
        }
        C6757a.m38592a(this.f30211k, this.f30209i, gVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m38548G(CharSequence charSequence) {
        ListAdapter listAdapter = this.f30223w;
        if (listAdapter != null && (listAdapter instanceof Filterable)) {
            ((Filterable) listAdapter).getFilter().filter(charSequence, this);
        }
    }

    private String[] getSuggestions() {
        String[] strArr = new String[this.f30204D.size()];
        for (int i = 0; i < this.f30204D.size(); i++) {
            strArr[i] = this.f30204D.get(i).mo9218n() + " - " + this.f30204D.get(i).mo9210g();
        }
        return strArr;
    }

    /* renamed from: q */
    private void m38562q() {
        this.f30214n.setOnEditorActionListener(new C6744a());
        this.f30214n.addTextChangedListener(new C6745b());
        this.f30214n.setOnFocusChangeListener(new C6746c());
    }

    /* renamed from: r */
    private void m38563r(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f30203C.obtainStyledAttributes(attributeSet, C7941a.MaterialSearchView, i, 0);
        if (obtainStyledAttributes != null) {
            if (obtainStyledAttributes.hasValue(5)) {
                setBackground(obtainStyledAttributes.getDrawable(5));
            }
            if (obtainStyledAttributes.hasValue(0)) {
                setTextColor(obtainStyledAttributes.getColor(0, 0));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                setHintTextColor(obtainStyledAttributes.getColor(1, 0));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                setHint(obtainStyledAttributes.getString(2));
            }
            if (obtainStyledAttributes.hasValue(9)) {
                setVoiceIcon(obtainStyledAttributes.getDrawable(9));
            }
            if (obtainStyledAttributes.hasValue(6)) {
                setCloseIcon(obtainStyledAttributes.getDrawable(6));
            }
            if (obtainStyledAttributes.hasValue(4)) {
                setBackIcon(obtainStyledAttributes.getDrawable(4));
            }
            if (obtainStyledAttributes.hasValue(7)) {
                setSuggestionBackground(obtainStyledAttributes.getDrawable(7));
            }
            if (obtainStyledAttributes.hasValue(8)) {
                setSuggestionIcon(obtainStyledAttributes.getDrawable(8));
            }
            if (obtainStyledAttributes.hasValue(3)) {
                setInputType(obtainStyledAttributes.getInt(3, 0));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: s */
    private void m38564s() {
        LayoutInflater.from(this.f30203C).inflate(R.layout.search_view, this, true);
        View findViewById = findViewById(R.id.search_layout);
        this.f30211k = findViewById;
        this.f30218r = (RelativeLayout) findViewById.findViewById(R.id.search_top_bar);
        this.f30213m = (ListView) this.f30211k.findViewById(R.id.suggestion_list);
        this.f30214n = (EditText) this.f30211k.findViewById(R.id.searchTextView);
        this.f30215o = (ImageButton) this.f30211k.findViewById(R.id.action_up_btn);
        m38569y();
        this.f30216p = (ImageButton) this.f30211k.findViewById(R.id.action_voice_btn);
        this.f30217q = (ImageButton) this.f30211k.findViewById(R.id.action_empty_btn);
        this.f30212l = this.f30211k.findViewById(R.id.transparent_view);
        this.f30214n.setOnClickListener(this.f30206F);
        this.f30215o.setOnClickListener(this.f30206F);
        this.f30216p.setOnClickListener(this.f30206F);
        this.f30217q.setOnClickListener(this.f30206F);
        this.f30212l.setOnClickListener(this.f30206F);
        this.f30201A = false;
        mo26256F(true);
        m38562q();
        this.f30213m.setVisibility(8);
        setAnimationDuration(C6757a.f30245a);
    }

    /* renamed from: u */
    private boolean m38565u() {
        if (!isInEditMode() && getContext().getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).size() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m38566v() {
        Editable text = this.f30214n.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C6751h hVar = this.f30221u;
            if (hVar == null || !hVar.mo26307b(text.toString())) {
                mo26258n();
                this.f30214n.setText((CharSequence) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m38567w(CharSequence charSequence) {
        Editable text = this.f30214n.getText();
        this.f30220t = text;
        if (!TextUtils.isEmpty(text)) {
            this.f30217q.setVisibility(0);
            mo26256F(false);
        } else {
            this.f30217q.setVisibility(8);
            mo26256F(true);
        }
        if (this.f30221u != null && !TextUtils.equals(charSequence, this.f30219s)) {
            this.f30221u.mo26306a(charSequence.toString());
        }
        this.f30219s = charSequence.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m38568x() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
        Context context = this.f30203C;
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intent, 9999);
        }
    }

    /* renamed from: y */
    private void m38569y() {
        if (!C8345u.m46336q()) {
            this.f30215o.setImageDrawable(getResources().getDrawable(R.drawable.back_w));
        } else {
            this.f30215o.setImageDrawable(getResources().getDrawable(R.drawable.back_w_rtl));
        }
    }

    /* renamed from: B */
    public void mo26252B(View view) {
        if (Build.VERSION.SDK_INT <= 10 && view.hasFocus()) {
            view.clearFocus();
        }
        view.requestFocus();
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }

    /* renamed from: C */
    public void mo26253C() {
        mo26254D(true);
    }

    /* renamed from: D */
    public void mo26254D(boolean z) {
        if (!mo26288t()) {
            this.f30214n.setText((CharSequence) null);
            this.f30214n.requestFocus();
            if (z) {
                m38547A();
            } else {
                this.f30211k.setVisibility(0);
                C6752i iVar = this.f30222v;
                if (iVar != null) {
                    iVar.mo26308a();
                }
            }
            this.f30208h = true;
        }
    }

    /* renamed from: E */
    public void mo26255E() {
        ListAdapter listAdapter = this.f30223w;
        if (listAdapter != null && listAdapter.getCount() > 0 && this.f30213m.getVisibility() == 8) {
            this.f30213m.setVisibility(0);
        }
    }

    /* renamed from: F */
    public void mo26256F(boolean z) {
        if (!z || !m38565u() || !this.f30201A) {
            this.f30216p.setVisibility(8);
        } else {
            this.f30216p.setVisibility(0);
        }
    }

    public void clearFocus() {
        this.f30210j = true;
        mo26263p(this);
        super.clearFocus();
        this.f30214n.clearFocus();
        this.f30210j = false;
    }

    /* renamed from: n */
    public void mo26258n() {
        if (mo26288t()) {
            this.f30214n.setText((CharSequence) null);
            mo26259o();
            clearFocus();
            this.f30211k.setVisibility(8);
            C6752i iVar = this.f30222v;
            if (iVar != null) {
                iVar.mo26309b();
            }
            this.f30208h = false;
        }
    }

    /* renamed from: o */
    public void mo26259o() {
        if (this.f30213m.getVisibility() == 0) {
            this.f30213m.setVisibility(8);
        }
    }

    public void onFilterComplete(int i) {
        if (i > 0) {
            mo26255E();
        } else {
            mo26259o();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f30224x = savedState;
        if (savedState.f30228h) {
            mo26254D(false);
            mo26289z(this.f30224x.f30227g, false);
        }
        super.onRestoreInstanceState(this.f30224x.getSuperState());
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        this.f30224x = savedState;
        CharSequence charSequence = this.f30220t;
        savedState.f30227g = charSequence != null ? charSequence.toString() : null;
        SavedState savedState2 = this.f30224x;
        savedState2.f30228h = this.f30208h;
        return savedState2;
    }

    /* renamed from: p */
    public void mo26263p(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public boolean requestFocus(int i, Rect rect) {
        if (!this.f30210j && isFocusable()) {
            return this.f30214n.requestFocus(i, rect);
        }
        return false;
    }

    public void setAdapter(ListAdapter listAdapter) {
        this.f30223w = listAdapter;
        this.f30213m.setAdapter(listAdapter);
        m38548G(this.f30214n.getText());
    }

    public void setAnimationDuration(int i) {
        this.f30209i = i;
    }

    public void setBackIcon(Drawable drawable) {
        this.f30215o.setImageDrawable(drawable);
    }

    public void setBackground(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f30218r.setBackground(drawable);
        } else {
            this.f30218r.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundColor(int i) {
        this.f30218r.setBackgroundColor(i);
    }

    public void setCloseIcon(Drawable drawable) {
        this.f30217q.setImageDrawable(drawable);
    }

    public void setCursorDrawable(int i) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this.f30214n, Integer.valueOf(i));
        } catch (Exception e) {
            Log.e("MaterialSearchView", e.toString());
        }
    }

    public void setEllipsize(boolean z) {
        this.f30226z = z;
    }

    public void setHint(CharSequence charSequence) {
        this.f30214n.setHint(charSequence);
    }

    public void setHintTextColor(int i) {
        this.f30214n.setHintTextColor(i);
    }

    public void setInputType(int i) {
        this.f30214n.setInputType(i);
    }

    public void setMenuItem(MenuItem menuItem) {
        this.f30207g = menuItem;
        menuItem.setOnMenuItemClickListener(new C6749f());
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f30213m.setOnItemClickListener(onItemClickListener);
    }

    public void setOnQueryTextListener(C6751h hVar) {
        this.f30221u = hVar;
    }

    public void setOnSearchViewListener(C6752i iVar) {
        this.f30222v = iVar;
    }

    public void setPlayDismissListener(C7962o oVar) {
    }

    public void setSubmitOnClick(boolean z) {
        this.f30225y = z;
    }

    public void setSuggestionBackground(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f30213m.setBackground(drawable);
        } else {
            this.f30213m.setBackgroundDrawable(drawable);
        }
    }

    public void setSuggestionIcon(Drawable drawable) {
        this.f30202B = drawable;
    }

    public void setSuggestions(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            this.f30212l.setVisibility(8);
            return;
        }
        this.f30212l.setVisibility(0);
        C6754b bVar = new C6754b(this.f30203C, strArr, this.f30202B, this.f30226z);
        setAdapter(bVar);
        setOnItemClickListener(new C6748e(bVar));
    }

    public void setTextColor(int i) {
        this.f30214n.setTextColor(i);
    }

    public void setVoiceIcon(Drawable drawable) {
        this.f30216p.setImageDrawable(drawable);
    }

    public void setVoiceSearch(boolean z) {
        this.f30201A = z;
    }

    /* renamed from: t */
    public boolean mo26288t() {
        return this.f30208h;
    }

    /* renamed from: z */
    public void mo26289z(CharSequence charSequence, boolean z) {
        this.f30214n.setText(charSequence);
        if (charSequence != null) {
            EditText editText = this.f30214n;
            editText.setSelection(editText.length());
            this.f30220t = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            m38566v();
        }
    }

    public MaterialSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f30208h = false;
        this.f30225y = false;
        this.f30226z = false;
        this.f30206F = new C6747d();
        this.f30203C = context;
        m38564s();
        m38563r(attributeSet, i);
    }
}
