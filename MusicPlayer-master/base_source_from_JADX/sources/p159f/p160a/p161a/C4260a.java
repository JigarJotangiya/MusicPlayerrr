package p159f.p160a.p161a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.C1435c;
import java.util.ArrayList;
import p159f.p160a.p161a.C4269f;
import p159f.p160a.p161a.p163r.C4297a;

/* renamed from: f.a.a.a */
/* compiled from: DefaultRvAdapter */
class C4260a extends RecyclerView.C0797h<C4262b> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4269f f12721a;

    /* renamed from: b */
    private final int f12722b;

    /* renamed from: c */
    private final C4267e f12723c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4263c f12724d;

    /* renamed from: f.a.a.a$a */
    /* compiled from: DefaultRvAdapter */
    static /* synthetic */ class C4261a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12725a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                f.a.a.f$l[] r0 = p159f.p160a.p161a.C4269f.C4282l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12725a = r0
                f.a.a.f$l r1 = p159f.p160a.p161a.C4269f.C4282l.SINGLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12725a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.a.a.f$l r1 = p159f.p160a.p161a.C4269f.C4282l.MULTI     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p160a.p161a.C4260a.C4261a.<clinit>():void");
        }
    }

    /* renamed from: f.a.a.a$b */
    /* compiled from: DefaultRvAdapter */
    static class C4262b extends RecyclerView.C0792c0 implements View.OnClickListener, View.OnLongClickListener {

        /* renamed from: g */
        final CompoundButton f12726g;

        /* renamed from: h */
        final TextView f12727h;

        /* renamed from: i */
        final C4260a f12728i;

        C4262b(View view, C4260a aVar) {
            super(view);
            this.f12726g = (CompoundButton) view.findViewById(C4288k.md_control);
            this.f12727h = (TextView) view.findViewById(C4288k.md_title);
            this.f12728i = aVar;
            view.setOnClickListener(this);
            if (aVar.f12721a.f12735i.f12769F != null) {
                view.setOnLongClickListener(this);
            }
        }

        public void onClick(View view) {
            if (this.f12728i.f12724d != null && getAdapterPosition() != -1) {
                CharSequence charSequence = null;
                if (this.f12728i.f12721a.f12735i.f12822l != null && getAdapterPosition() < this.f12728i.f12721a.f12735i.f12822l.size()) {
                    charSequence = this.f12728i.f12721a.f12735i.f12822l.get(getAdapterPosition());
                }
                View view2 = view;
                this.f12728i.f12724d.mo14580a(this.f12728i.f12721a, view2, getAdapterPosition(), charSequence, false);
            }
        }

        public boolean onLongClick(View view) {
            if (this.f12728i.f12724d == null || getAdapterPosition() == -1) {
                return false;
            }
            CharSequence charSequence = null;
            if (this.f12728i.f12721a.f12735i.f12822l != null && getAdapterPosition() < this.f12728i.f12721a.f12735i.f12822l.size()) {
                charSequence = this.f12728i.f12721a.f12735i.f12822l.get(getAdapterPosition());
            }
            return this.f12728i.f12724d.mo14580a(this.f12728i.f12721a, view, getAdapterPosition(), charSequence, true);
        }
    }

    /* renamed from: f.a.a.a$c */
    /* compiled from: DefaultRvAdapter */
    interface C4263c {
        /* renamed from: a */
        boolean mo14580a(C4269f fVar, View view, int i, CharSequence charSequence, boolean z);
    }

    C4260a(C4269f fVar, int i) {
        this.f12721a = fVar;
        this.f12722b = i;
        this.f12723c = fVar.f12735i.f12810f;
    }

    @TargetApi(17)
    /* renamed from: e */
    private boolean m18708e() {
        if (Build.VERSION.SDK_INT >= 17 && this.f12721a.mo14595o().mo14636k().getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @TargetApi(17)
    /* renamed from: i */
    private void m18709i(ViewGroup viewGroup) {
        ((LinearLayout) viewGroup).setGravity(this.f12723c.getGravityInt() | 16);
        if (viewGroup.getChildCount() != 2) {
            return;
        }
        if (this.f12723c == C4267e.END && !m18708e() && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
            CompoundButton compoundButton = (CompoundButton) viewGroup.getChildAt(0);
            viewGroup.removeView(compoundButton);
            TextView textView = (TextView) viewGroup.getChildAt(0);
            viewGroup.removeView(textView);
            textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
            viewGroup.addView(textView);
            viewGroup.addView(compoundButton);
        } else if (this.f12723c == C4267e.START && m18708e() && (viewGroup.getChildAt(1) instanceof CompoundButton)) {
            CompoundButton compoundButton2 = (CompoundButton) viewGroup.getChildAt(1);
            viewGroup.removeView(compoundButton2);
            TextView textView2 = (TextView) viewGroup.getChildAt(0);
            viewGroup.removeView(textView2);
            textView2.setPadding(textView2.getPaddingRight(), textView2.getPaddingTop(), textView2.getPaddingRight(), textView2.getPaddingBottom());
            viewGroup.addView(compoundButton2);
            viewGroup.addView(textView2);
        }
    }

    /* renamed from: f */
    public void onBindViewHolder(C4262b bVar, int i) {
        View view = bVar.itemView;
        boolean h = C4297a.m18794h(Integer.valueOf(i), this.f12721a.f12735i.f12790Q);
        int a = h ? C4297a.m18787a(this.f12721a.f12735i.f12815h0, 0.4f) : this.f12721a.f12735i.f12815h0;
        bVar.itemView.setEnabled(!h);
        int i2 = C4261a.f12725a[this.f12721a.f12751y.ordinal()];
        if (i2 == 1) {
            RadioButton radioButton = (RadioButton) bVar.f12726g;
            C4269f.C4274d dVar = this.f12721a.f12735i;
            boolean z = dVar.f12787O == i;
            ColorStateList colorStateList = dVar.f12840u;
            if (colorStateList != null) {
                C1435c.m7541i(radioButton, colorStateList);
            } else {
                C1435c.m7540h(radioButton, dVar.f12838t);
            }
            radioButton.setChecked(z);
            radioButton.setEnabled(!h);
        } else if (i2 == 2) {
            CheckBox checkBox = (CheckBox) bVar.f12726g;
            boolean contains = this.f12721a.f12752z.contains(Integer.valueOf(i));
            C4269f.C4274d dVar2 = this.f12721a.f12735i;
            ColorStateList colorStateList2 = dVar2.f12840u;
            if (colorStateList2 != null) {
                C1435c.m7536d(checkBox, colorStateList2);
            } else {
                C1435c.m7535c(checkBox, dVar2.f12838t);
            }
            checkBox.setChecked(contains);
            checkBox.setEnabled(!h);
        }
        bVar.f12727h.setText(this.f12721a.f12735i.f12822l.get(i));
        bVar.f12727h.setTextColor(a);
        C4269f fVar = this.f12721a;
        fVar.mo14591A(bVar.f12727h, fVar.f12735i.f12792S);
        ViewGroup viewGroup = (ViewGroup) view;
        m18709i(viewGroup);
        int[] iArr = this.f12721a.f12735i.f12843v0;
        if (iArr != null) {
            if (i < iArr.length) {
                view.setId(iArr[i]);
            } else {
                view.setId(-1);
            }
        }
        if (Build.VERSION.SDK_INT >= 21 && viewGroup.getChildCount() == 2) {
            if (viewGroup.getChildAt(0) instanceof CompoundButton) {
                viewGroup.getChildAt(0).setBackground((Drawable) null);
            } else if (viewGroup.getChildAt(1) instanceof CompoundButton) {
                viewGroup.getChildAt(1).setBackground((Drawable) null);
            }
        }
    }

    /* renamed from: g */
    public C4262b onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f12722b, viewGroup, false);
        C4297a.m18806t(inflate, this.f12721a.mo14599r());
        return new C4262b(inflate, this);
    }

    public int getItemCount() {
        ArrayList<CharSequence> arrayList = this.f12721a.f12735i.f12822l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo14577h(C4263c cVar) {
        this.f12724d = cVar;
    }
}
