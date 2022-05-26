package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p082e.p083a.C3400a;
import p082e.p083a.C3405f;
import p082e.p083a.C3409j;
import p082e.p109h.p119p.C3774v;

class AlertController {

    /* renamed from: A */
    NestedScrollView f235A;

    /* renamed from: B */
    private int f236B = 0;

    /* renamed from: C */
    private Drawable f237C;

    /* renamed from: D */
    private ImageView f238D;

    /* renamed from: E */
    private TextView f239E;

    /* renamed from: F */
    private TextView f240F;

    /* renamed from: G */
    private View f241G;

    /* renamed from: H */
    ListAdapter f242H;

    /* renamed from: I */
    int f243I = -1;

    /* renamed from: J */
    private int f244J;

    /* renamed from: K */
    private int f245K;

    /* renamed from: L */
    int f246L;

    /* renamed from: M */
    int f247M;

    /* renamed from: N */
    int f248N;

    /* renamed from: O */
    int f249O;

    /* renamed from: P */
    private boolean f250P;

    /* renamed from: Q */
    private int f251Q = 0;

    /* renamed from: R */
    Handler f252R;

    /* renamed from: S */
    private final View.OnClickListener f253S = new C0088a();

    /* renamed from: a */
    private final Context f254a;

    /* renamed from: b */
    final C0137f f255b;

    /* renamed from: c */
    private final Window f256c;

    /* renamed from: d */
    private final int f257d;

    /* renamed from: e */
    private CharSequence f258e;

    /* renamed from: f */
    private CharSequence f259f;

    /* renamed from: g */
    ListView f260g;

    /* renamed from: h */
    private View f261h;

    /* renamed from: i */
    private int f262i;

    /* renamed from: j */
    private int f263j;

    /* renamed from: k */
    private int f264k;

    /* renamed from: l */
    private int f265l;

    /* renamed from: m */
    private int f266m;

    /* renamed from: n */
    private boolean f267n = false;

    /* renamed from: o */
    Button f268o;

    /* renamed from: p */
    private CharSequence f269p;

    /* renamed from: q */
    Message f270q;

    /* renamed from: r */
    private Drawable f271r;

    /* renamed from: s */
    Button f272s;

    /* renamed from: t */
    private CharSequence f273t;

    /* renamed from: u */
    Message f274u;

    /* renamed from: v */
    private Drawable f275v;

    /* renamed from: w */
    Button f276w;

    /* renamed from: x */
    private CharSequence f277x;

    /* renamed from: y */
    Message f278y;

    /* renamed from: z */
    private Drawable f279z;

    public static class RecycleListView extends ListView {

        /* renamed from: g */
        private final int f280g;

        /* renamed from: h */
        private final int f281h;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        /* renamed from: a */
        public void mo449a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f280g, getPaddingRight(), z2 ? getPaddingBottom() : this.f281h);
            }
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3409j.RecycleListView);
            this.f281h = obtainStyledAttributes.getDimensionPixelOffset(C3409j.RecycleListView_paddingBottomNoButtons, -1);
            this.f280g = obtainStyledAttributes.getDimensionPixelOffset(C3409j.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class C0088a implements View.OnClickListener {
        C0088a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r3 = r0.f278y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f268o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f270q
                if (r1 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x000f:
                android.widget.Button r1 = r0.f272s
                if (r3 != r1) goto L_0x001c
                android.os.Message r1 = r0.f274u
                if (r1 == 0) goto L_0x001c
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x001c:
                android.widget.Button r1 = r0.f276w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f278y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f252R
                r1 = 1
                androidx.appcompat.app.f r3 = r3.f255b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0088a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    class C0089b implements NestedScrollView.C0542b {

        /* renamed from: a */
        final /* synthetic */ View f283a;

        /* renamed from: b */
        final /* synthetic */ View f284b;

        C0089b(AlertController alertController, View view, View view2) {
            this.f283a = view;
            this.f284b = view2;
        }

        /* renamed from: a */
        public void mo451a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m501g(nestedScrollView, this.f283a, this.f284b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    class C0090c implements Runnable {

        /* renamed from: g */
        final /* synthetic */ View f285g;

        /* renamed from: h */
        final /* synthetic */ View f286h;

        C0090c(View view, View view2) {
            this.f285g = view;
            this.f286h = view2;
        }

        public void run() {
            AlertController.m501g(AlertController.this.f235A, this.f285g, this.f286h);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    class C0091d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f288a;

        /* renamed from: b */
        final /* synthetic */ View f289b;

        C0091d(AlertController alertController, View view, View view2) {
            this.f288a = view;
            this.f289b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m501g(absListView, this.f288a, this.f289b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    class C0092e implements Runnable {

        /* renamed from: g */
        final /* synthetic */ View f290g;

        /* renamed from: h */
        final /* synthetic */ View f291h;

        C0092e(View view, View view2) {
            this.f290g = view;
            this.f291h = view2;
        }

        public void run() {
            AlertController.m501g(AlertController.this.f260g, this.f290g, this.f291h);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0093f {

        /* renamed from: A */
        public int f293A;

        /* renamed from: B */
        public int f294B;

        /* renamed from: C */
        public int f295C;

        /* renamed from: D */
        public int f296D;

        /* renamed from: E */
        public boolean f297E = false;

        /* renamed from: F */
        public boolean[] f298F;

        /* renamed from: G */
        public boolean f299G;

        /* renamed from: H */
        public boolean f300H;

        /* renamed from: I */
        public int f301I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f302J;

        /* renamed from: K */
        public Cursor f303K;

        /* renamed from: L */
        public String f304L;

        /* renamed from: M */
        public String f305M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f306N;

        /* renamed from: O */
        public C0098e f307O;

        /* renamed from: a */
        public final Context f308a;

        /* renamed from: b */
        public final LayoutInflater f309b;

        /* renamed from: c */
        public int f310c = 0;

        /* renamed from: d */
        public Drawable f311d;

        /* renamed from: e */
        public int f312e = 0;

        /* renamed from: f */
        public CharSequence f313f;

        /* renamed from: g */
        public View f314g;

        /* renamed from: h */
        public CharSequence f315h;

        /* renamed from: i */
        public CharSequence f316i;

        /* renamed from: j */
        public Drawable f317j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f318k;

        /* renamed from: l */
        public CharSequence f319l;

        /* renamed from: m */
        public Drawable f320m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f321n;

        /* renamed from: o */
        public CharSequence f322o;

        /* renamed from: p */
        public Drawable f323p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f324q;

        /* renamed from: r */
        public boolean f325r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f326s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f327t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f328u;

        /* renamed from: v */
        public CharSequence[] f329v;

        /* renamed from: w */
        public ListAdapter f330w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f331x;

        /* renamed from: y */
        public int f332y;

        /* renamed from: z */
        public View f333z;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        class C0094a extends ArrayAdapter<CharSequence> {

            /* renamed from: g */
            final /* synthetic */ RecycleListView f334g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0094a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f334g = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0093f.this.f298F;
                if (zArr != null && zArr[i]) {
                    this.f334g.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        class C0095b extends CursorAdapter {

            /* renamed from: g */
            private final int f336g;

            /* renamed from: h */
            private final int f337h;

            /* renamed from: i */
            final /* synthetic */ RecycleListView f338i;

            /* renamed from: j */
            final /* synthetic */ AlertController f339j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0095b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f338i = recycleListView;
                this.f339j = alertController;
                Cursor cursor2 = getCursor();
                this.f336g = cursor2.getColumnIndexOrThrow(C0093f.this.f304L);
                this.f337h = cursor2.getColumnIndexOrThrow(C0093f.this.f305M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f336g));
                RecycleListView recycleListView = this.f338i;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f337h) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0093f.this.f309b.inflate(this.f339j.f247M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        class C0096c implements AdapterView.OnItemClickListener {

            /* renamed from: g */
            final /* synthetic */ AlertController f341g;

            C0096c(AlertController alertController) {
                this.f341g = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0093f.this.f331x.onClick(this.f341g.f255b, i);
                if (!C0093f.this.f300H) {
                    this.f341g.f255b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        class C0097d implements AdapterView.OnItemClickListener {

            /* renamed from: g */
            final /* synthetic */ RecycleListView f343g;

            /* renamed from: h */
            final /* synthetic */ AlertController f344h;

            C0097d(RecycleListView recycleListView, AlertController alertController) {
                this.f343g = recycleListView;
                this.f344h = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0093f.this.f298F;
                if (zArr != null) {
                    zArr[i] = this.f343g.isItemChecked(i);
                }
                C0093f.this.f302J.onClick(this.f344h.f255b, i, this.f343g.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface C0098e {
            /* renamed from: a */
            void mo462a(ListView listView);
        }

        public C0093f(Context context) {
            this.f308a = context;
            this.f325r = true;
            this.f309b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m527b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f309b
                int r1 = r11.f246L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f299G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f303K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f308a
                int r4 = r11.f247M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f329v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f308a
                android.database.Cursor r4 = r10.f303K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.f300H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.f248N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.f249O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.f303K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f308a
                android.database.Cursor r5 = r10.f303K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f304L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f330w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f308a
                java.lang.CharSequence[] r3 = r10.f329v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.f307O
                if (r1 == 0) goto L_0x0072
                r1.mo462a(r0)
            L_0x0072:
                r11.f242H = r9
                int r1 = r10.f301I
                r11.f243I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f331x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x0091
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f302J
                if (r1 == 0) goto L_0x0091
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x0091:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f306N
                if (r1 == 0) goto L_0x0098
                r0.setOnItemSelectedListener(r1)
            L_0x0098:
                boolean r1 = r10.f300H
                if (r1 == 0) goto L_0x00a0
                r0.setChoiceMode(r8)
                goto L_0x00a8
            L_0x00a0:
                boolean r1 = r10.f299G
                if (r1 == 0) goto L_0x00a8
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a8:
                r11.f260g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0093f.m527b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo456a(AlertController alertController) {
            View view = this.f314g;
            if (view != null) {
                alertController.mo441m(view);
            } else {
                CharSequence charSequence = this.f313f;
                if (charSequence != null) {
                    alertController.mo445r(charSequence);
                }
                Drawable drawable = this.f311d;
                if (drawable != null) {
                    alertController.mo443o(drawable);
                }
                int i = this.f310c;
                if (i != 0) {
                    alertController.mo442n(i);
                }
                int i2 = this.f312e;
                if (i2 != 0) {
                    alertController.mo442n(alertController.mo435d(i2));
                }
            }
            CharSequence charSequence2 = this.f315h;
            if (charSequence2 != null) {
                alertController.mo444p(charSequence2);
            }
            CharSequence charSequence3 = this.f316i;
            if (!(charSequence3 == null && this.f317j == null)) {
                alertController.mo440l(-1, charSequence3, this.f318k, (Message) null, this.f317j);
            }
            CharSequence charSequence4 = this.f319l;
            if (!(charSequence4 == null && this.f320m == null)) {
                alertController.mo440l(-2, charSequence4, this.f321n, (Message) null, this.f320m);
            }
            CharSequence charSequence5 = this.f322o;
            if (!(charSequence5 == null && this.f323p == null)) {
                alertController.mo440l(-3, charSequence5, this.f324q, (Message) null, this.f323p);
            }
            if (!(this.f329v == null && this.f303K == null && this.f330w == null)) {
                m527b(alertController);
            }
            View view2 = this.f333z;
            if (view2 == null) {
                int i3 = this.f332y;
                if (i3 != 0) {
                    alertController.mo446s(i3);
                }
            } else if (this.f297E) {
                alertController.mo448u(view2, this.f293A, this.f294B, this.f295C, this.f296D);
            } else {
                alertController.mo447t(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static final class C0099g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f346a;

        public C0099g(DialogInterface dialogInterface) {
            this.f346a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f346a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    private static class C0100h extends ArrayAdapter<CharSequence> {
        public C0100h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0137f fVar, Window window) {
        this.f254a = context;
        this.f255b = fVar;
        this.f256c = window;
        this.f252R = new C0099g(fVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C3409j.AlertDialog, C3400a.alertDialogStyle, 0);
        this.f244J = obtainStyledAttributes.getResourceId(C3409j.AlertDialog_android_layout, 0);
        this.f245K = obtainStyledAttributes.getResourceId(C3409j.AlertDialog_buttonPanelSideLayout, 0);
        this.f246L = obtainStyledAttributes.getResourceId(C3409j.AlertDialog_listLayout, 0);
        this.f247M = obtainStyledAttributes.getResourceId(C3409j.AlertDialog_multiChoiceItemLayout, 0);
        this.f248N = obtainStyledAttributes.getResourceId(C3409j.AlertDialog_singleChoiceItemLayout, 0);
        this.f249O = obtainStyledAttributes.getResourceId(C3409j.AlertDialog_listItemLayout, 0);
        this.f250P = obtainStyledAttributes.getBoolean(C3409j.AlertDialog_showTitle, true);
        this.f257d = obtainStyledAttributes.getDimensionPixelSize(C3409j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        fVar.mo652d(1);
    }

    /* renamed from: A */
    private static boolean m498A(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C3400a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static boolean m499a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m499a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m500b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: g */
    static void m501g(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: j */
    private ViewGroup m502j(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: k */
    private int m503k() {
        int i = this.f245K;
        if (i == 0) {
            return this.f244J;
        }
        if (this.f251Q == 1) {
            return i;
        }
        return this.f244J;
    }

    /* renamed from: q */
    private void m504q(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f256c.findViewById(C3405f.scrollIndicatorUp);
        View findViewById2 = this.f256c.findViewById(C3405f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C3774v.m16160F0(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById != null || findViewById2 != null) {
            if (this.f259f != null) {
                this.f235A.setOnScrollChangeListener(new C0089b(this, findViewById, findViewById2));
                this.f235A.post(new C0090c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f260g;
            if (listView != null) {
                listView.setOnScrollListener(new C0091d(this, findViewById, findViewById2));
                this.f260g.post(new C0092e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        }
    }

    /* renamed from: v */
    private void m505v(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f268o = button;
        button.setOnClickListener(this.f253S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f269p) || this.f271r != null) {
            this.f268o.setText(this.f269p);
            Drawable drawable = this.f271r;
            if (drawable != null) {
                int i = this.f257d;
                drawable.setBounds(0, 0, i, i);
                this.f268o.setCompoundDrawables(this.f271r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f268o.setVisibility(0);
            z = true;
        } else {
            this.f268o.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f272s = button2;
        button2.setOnClickListener(this.f253S);
        if (!TextUtils.isEmpty(this.f273t) || this.f275v != null) {
            this.f272s.setText(this.f273t);
            Drawable drawable2 = this.f275v;
            if (drawable2 != null) {
                int i2 = this.f257d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f272s.setCompoundDrawables(this.f275v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f272s.setVisibility(0);
            z |= true;
        } else {
            this.f272s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f276w = button3;
        button3.setOnClickListener(this.f253S);
        if (!TextUtils.isEmpty(this.f277x) || this.f279z != null) {
            this.f276w.setText(this.f277x);
            Drawable drawable3 = this.f279z;
            if (drawable3 != null) {
                int i3 = this.f257d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f276w.setCompoundDrawables(this.f279z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f276w.setVisibility(0);
            z |= true;
        } else {
            this.f276w.setVisibility(8);
        }
        if (m498A(this.f254a)) {
            if (z) {
                m500b(this.f268o);
            } else if (z) {
                m500b(this.f272s);
            } else if (z) {
                m500b(this.f276w);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: w */
    private void m506w(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f256c.findViewById(C3405f.scrollView);
        this.f235A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f235A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f240F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f259f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f235A.removeView(this.f240F);
            if (this.f260g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f235A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f235A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f260g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: x */
    private void m507x(ViewGroup viewGroup) {
        View view = this.f261h;
        boolean z = false;
        if (view == null) {
            view = this.f262i != 0 ? LayoutInflater.from(this.f254a).inflate(this.f262i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m499a(view)) {
            this.f256c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f256c.findViewById(C3405f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f267n) {
                frameLayout.setPadding(this.f263j, this.f264k, this.f265l, this.f266m);
            }
            if (this.f260g != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).f1011a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: y */
    private void m508y(ViewGroup viewGroup) {
        if (this.f241G != null) {
            viewGroup.addView(this.f241G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f256c.findViewById(C3405f.title_template).setVisibility(8);
            return;
        }
        this.f238D = (ImageView) this.f256c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f258e)) || !this.f250P) {
            this.f256c.findViewById(C3405f.title_template).setVisibility(8);
            this.f238D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f256c.findViewById(C3405f.alertTitle);
        this.f239E = textView;
        textView.setText(this.f258e);
        int i = this.f236B;
        if (i != 0) {
            this.f238D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f237C;
        if (drawable != null) {
            this.f238D.setImageDrawable(drawable);
            return;
        }
        this.f239E.setPadding(this.f238D.getPaddingLeft(), this.f238D.getPaddingTop(), this.f238D.getPaddingRight(), this.f238D.getPaddingBottom());
        this.f238D.setVisibility(8);
    }

    /* renamed from: z */
    private void m509z() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f256c.findViewById(C3405f.parentPanel);
        int i = C3405f.topPanel;
        View findViewById4 = findViewById3.findViewById(i);
        int i2 = C3405f.contentPanel;
        View findViewById5 = findViewById3.findViewById(i2);
        int i3 = C3405f.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C3405f.customPanel);
        m507x(viewGroup);
        View findViewById7 = viewGroup.findViewById(i);
        View findViewById8 = viewGroup.findViewById(i2);
        View findViewById9 = viewGroup.findViewById(i3);
        ViewGroup j = m502j(findViewById7, findViewById4);
        ViewGroup j2 = m502j(findViewById8, findViewById5);
        ViewGroup j3 = m502j(findViewById9, findViewById6);
        m506w(j2);
        m505v(j3);
        m508y(j);
        char c = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (j == null || j.getVisibility() == 8) ? false : true;
        boolean z3 = (j3 == null || j3.getVisibility() == 8) ? false : true;
        if (!(z3 || j2 == null || (findViewById2 = j2.findViewById(C3405f.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f235A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f259f == null && this.f260g == null)) {
                view = j.findViewById(C3405f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(j2 == null || (findViewById = j2.findViewById(C3405f.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f260g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo449a(z2, z3);
        }
        if (!z) {
            View view2 = this.f260g;
            if (view2 == null) {
                view2 = this.f235A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m504q(j2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f260g;
        if (listView2 != null && (listAdapter = this.f242H) != null) {
            listView2.setAdapter(listAdapter);
            int i4 = this.f243I;
            if (i4 > -1) {
                listView2.setItemChecked(i4, true);
                listView2.setSelection(i4);
            }
        }
    }

    /* renamed from: c */
    public Button mo434c(int i) {
        if (i == -3) {
            return this.f276w;
        }
        if (i == -2) {
            return this.f272s;
        }
        if (i != -1) {
            return null;
        }
        return this.f268o;
    }

    /* renamed from: d */
    public int mo435d(int i) {
        TypedValue typedValue = new TypedValue();
        this.f254a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView mo436e() {
        return this.f260g;
    }

    /* renamed from: f */
    public void mo437f() {
        this.f255b.setContentView(m503k());
        m509z();
    }

    /* renamed from: h */
    public boolean mo438h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f235A;
        return nestedScrollView != null && nestedScrollView.mo3404q(keyEvent);
    }

    /* renamed from: i */
    public boolean mo439i(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f235A;
        return nestedScrollView != null && nestedScrollView.mo3404q(keyEvent);
    }

    /* renamed from: l */
    public void mo440l(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f252R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f277x = charSequence;
            this.f278y = message;
            this.f279z = drawable;
        } else if (i == -2) {
            this.f273t = charSequence;
            this.f274u = message;
            this.f275v = drawable;
        } else if (i == -1) {
            this.f269p = charSequence;
            this.f270q = message;
            this.f271r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: m */
    public void mo441m(View view) {
        this.f241G = view;
    }

    /* renamed from: n */
    public void mo442n(int i) {
        this.f237C = null;
        this.f236B = i;
        ImageView imageView = this.f238D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f238D.setImageResource(this.f236B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: o */
    public void mo443o(Drawable drawable) {
        this.f237C = drawable;
        this.f236B = 0;
        ImageView imageView = this.f238D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f238D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: p */
    public void mo444p(CharSequence charSequence) {
        this.f259f = charSequence;
        TextView textView = this.f240F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void mo445r(CharSequence charSequence) {
        this.f258e = charSequence;
        TextView textView = this.f239E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: s */
    public void mo446s(int i) {
        this.f261h = null;
        this.f262i = i;
        this.f267n = false;
    }

    /* renamed from: t */
    public void mo447t(View view) {
        this.f261h = view;
        this.f262i = 0;
        this.f267n = false;
    }

    /* renamed from: u */
    public void mo448u(View view, int i, int i2, int i3, int i4) {
        this.f261h = view;
        this.f262i = 0;
        this.f267n = true;
        this.f263j = i;
        this.f264k = i2;
        this.f265l = i3;
        this.f266m = i4;
    }
}
