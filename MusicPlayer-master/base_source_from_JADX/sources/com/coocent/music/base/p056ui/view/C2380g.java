package com.coocent.music.base.p056ui.view;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Objects;
import p159f.p166c.p181e.p182a.p183a.p189f.C4446i;
import p159f.p166c.p181e.p182a.p190b.C4448b;
import p159f.p166c.p181e.p182a.p190b.C4449c;
import p159f.p166c.p181e.p182a.p190b.C4452f;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p159f.p166c.p181e.p182a.p190b.p197l.C4481e;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.coocent.music.base.ui.view.g */
/* compiled from: CreatePlaylistDialog.kt */
public final class C2380g extends Dialog {

    /* renamed from: com.coocent.music.base.ui.view.g$a */
    /* compiled from: CreatePlaylistDialog.kt */
    public static final class C2381a {

        /* renamed from: a */
        private final Context f8312a;

        /* renamed from: b */
        private TextView f8313b;

        /* renamed from: c */
        private ImageView f8314c;

        /* renamed from: d */
        private final C2383b f8315d = new C2383b();

        /* renamed from: e */
        private EditText f8316e;

        /* renamed from: f */
        private TextView f8317f;

        /* renamed from: g */
        private TextView f8318g;

        /* renamed from: h */
        private C2380g f8319h;

        /* renamed from: com.coocent.music.base.ui.view.g$a$a */
        /* compiled from: CreatePlaylistDialog.kt */
        public static final class C2382a implements TextWatcher {

            /* renamed from: g */
            final /* synthetic */ C2381a f8320g;

            C2382a(C2381a aVar) {
                this.f8320g = aVar;
            }

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.f8320g.m11161l(!(charSequence == null || charSequence.length() == 0));
            }
        }

        public C2381a(Context context) {
            C8594l.m46771e(context, "context");
            this.f8312a = context;
        }

        /* renamed from: c */
        private final void m11155c(C2380g gVar, C2381a aVar) {
            View inflate = View.inflate(this.f8312a, C4449c.dialog_create_playlist, (ViewGroup) null);
            if (inflate != null) {
                gVar.setContentView(inflate);
                C8594l.m46770d(inflate, "view");
                m11157e(inflate);
                m11162m();
                m11163n();
            }
        }

        /* renamed from: d */
        private final void m11156d(String str) {
            long h = C4477c.m19621h(this.f8312a, str);
            if (h >= 0) {
                if (this.f8315d.mo9342d() != null) {
                    Context context = this.f8312a;
                    long[] d = this.f8315d.mo9342d();
                    C8594l.m46769c(d);
                    int a = C4477c.m19607a(context, d, h);
                    if (a >= 0) {
                        Toast.makeText(this.f8312a, C4452f.music_eq_msg_add_songs_to_playlist_ok, 0).show();
                        C2380g gVar = this.f8319h;
                        if (gVar != null) {
                            gVar.dismiss();
                            C2388i b = this.f8315d.mo9340b();
                            if (b != null) {
                                C2380g gVar2 = this.f8319h;
                                if (gVar2 != null) {
                                    b.mo9365a(gVar2, h, str);
                                } else {
                                    C8594l.m46783q("createPlaylistDialog");
                                    throw null;
                                }
                            }
                        } else {
                            C8594l.m46783q("createPlaylistDialog");
                            throw null;
                        }
                    } else if (a == -1) {
                        Toast.makeText(this.f8312a, C4452f.music_eq_msg_playlist_name_exist, 0).show();
                    } else {
                        Toast.makeText(this.f8312a, C4452f.coocent_msgs_operation_failure, 0).show();
                    }
                } else {
                    Toast.makeText(this.f8312a, C4452f.music_eq_msg_playlist_create_ok, 0).show();
                    C2380g gVar3 = this.f8319h;
                    if (gVar3 != null) {
                        gVar3.dismiss();
                        C2388i b2 = this.f8315d.mo9340b();
                        if (b2 != null) {
                            C2380g gVar4 = this.f8319h;
                            if (gVar4 != null) {
                                b2.mo9365a(gVar4, h, str);
                            } else {
                                C8594l.m46783q("createPlaylistDialog");
                                throw null;
                            }
                        }
                    } else {
                        C8594l.m46783q("createPlaylistDialog");
                        throw null;
                    }
                }
            } else if (h == -1) {
                Toast.makeText(this.f8312a, C4452f.music_eq_msg_playlist_name_exist, 0).show();
            } else if (h == -2) {
                Toast.makeText(this.f8312a, C4452f.playlist_name_empty, 0).show();
            } else if (h == -3) {
                Toast.makeText(this.f8312a, C4452f.name_limit_100, 0).show();
            } else if (h == -4) {
                Toast.makeText(this.f8312a, C4452f.coocent_msgs_operation_failure, 0).show();
            }
        }

        /* renamed from: e */
        private final void m11157e(View view) {
            View findViewById = view.findViewById(C4448b.et_playlist_name);
            C8594l.m46770d(findViewById, "view.findViewById(R.id.et_playlist_name)");
            this.f8316e = (EditText) findViewById;
            View findViewById2 = view.findViewById(C4448b.iv_close);
            C8594l.m46770d(findViewById2, "view.findViewById(R.id.iv_close)");
            this.f8314c = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(C4448b.tv_save);
            C8594l.m46770d(findViewById3, "view.findViewById(R.id.tv_save)");
            this.f8317f = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C4448b.tv_cancel);
            C8594l.m46770d(findViewById4, "view.findViewById(R.id.tv_cancel)");
            this.f8318g = (TextView) findViewById4;
            View findViewById5 = view.findViewById(C4448b.tv_title);
            C8594l.m46770d(findViewById5, "view.findViewById(R.id.tv_title)");
            this.f8313b = (TextView) findViewById5;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final void m11161l(boolean z) {
            if (z) {
                TextView textView = this.f8317f;
                if (textView != null) {
                    textView.setTextColor(this.f8315d.mo9339a());
                    TextView textView2 = this.f8317f;
                    if (textView2 != null) {
                        textView2.setEnabled(true);
                        TextView textView3 = this.f8317f;
                        if (textView3 != null) {
                            textView3.setClickable(true);
                            ImageView imageView = this.f8314c;
                            if (imageView != null) {
                                imageView.setVisibility(0);
                            } else {
                                C8594l.m46783q("ivClean");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("tvSave");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("tvSave");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("tvSave");
                    throw null;
                }
            } else {
                TextView textView4 = this.f8317f;
                if (textView4 != null) {
                    textView4.setTextColor(C4481e.m19677a(this.f8315d.mo9339a(), 0.5f));
                    TextView textView5 = this.f8317f;
                    if (textView5 != null) {
                        textView5.setEnabled(false);
                        TextView textView6 = this.f8317f;
                        if (textView6 != null) {
                            textView6.setClickable(false);
                            ImageView imageView2 = this.f8314c;
                            if (imageView2 != null) {
                                imageView2.setVisibility(4);
                            } else {
                                C8594l.m46783q("ivClean");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("tvSave");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("tvSave");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("tvSave");
                    throw null;
                }
            }
        }

        /* renamed from: m */
        private final void m11162m() {
            boolean z = true;
            if (this.f8315d.mo9343e().length() == 0) {
                TextView textView = this.f8313b;
                if (textView != null) {
                    textView.setText(this.f8312a.getText(C4452f.create_playlist));
                } else {
                    C8594l.m46783q("tvTitle");
                    throw null;
                }
            } else {
                TextView textView2 = this.f8313b;
                if (textView2 != null) {
                    textView2.setText(this.f8315d.mo9343e());
                } else {
                    C8594l.m46783q("tvTitle");
                    throw null;
                }
            }
            EditText editText = this.f8316e;
            if (editText != null) {
                editText.setText(this.f8315d.mo9341c());
                EditText editText2 = this.f8316e;
                if (editText2 != null) {
                    editText2.setFocusableInTouchMode(true);
                    EditText editText3 = this.f8316e;
                    if (editText3 != null) {
                        editText3.requestFocus();
                        C2380g gVar = this.f8319h;
                        if (gVar != null) {
                            Window window = gVar.getWindow();
                            if (window != null) {
                                window.setSoftInputMode(5);
                            }
                            if (this.f8315d.mo9339a() != 0) {
                                TextView textView3 = this.f8317f;
                                if (textView3 != null) {
                                    textView3.setTextColor(this.f8315d.mo9339a());
                                    TextView textView4 = this.f8318g;
                                    if (textView4 != null) {
                                        textView4.setTextColor(this.f8315d.mo9339a());
                                        if (Build.VERSION.SDK_INT >= 21) {
                                            int[][] iArr = {new int[]{-16842919}, new int[]{16842919}};
                                            int[] iArr2 = {this.f8315d.mo9339a(), this.f8315d.mo9339a()};
                                            EditText editText4 = this.f8316e;
                                            if (editText4 != null) {
                                                editText4.setBackgroundTintList(new ColorStateList(iArr, iArr2));
                                            } else {
                                                C8594l.m46783q("etPlaylistName");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        C8594l.m46783q("tvCancel");
                                        throw null;
                                    }
                                } else {
                                    C8594l.m46783q("tvSave");
                                    throw null;
                                }
                            }
                            if (this.f8315d.mo9341c().length() != 0) {
                                z = false;
                            }
                            if (z) {
                                m11161l(false);
                                return;
                            }
                            return;
                        }
                        C8594l.m46783q("createPlaylistDialog");
                        throw null;
                    }
                    C8594l.m46783q("etPlaylistName");
                    throw null;
                }
                C8594l.m46783q("etPlaylistName");
                throw null;
            }
            C8594l.m46783q("etPlaylistName");
            throw null;
        }

        /* renamed from: n */
        private final void m11163n() {
            TextView textView = this.f8318g;
            if (textView != null) {
                textView.setOnClickListener(new C2375b(this));
                TextView textView2 = this.f8317f;
                if (textView2 != null) {
                    textView2.setOnClickListener(new C2374a(this));
                    ImageView imageView = this.f8314c;
                    if (imageView != null) {
                        imageView.setOnClickListener(new C2376c(this));
                        EditText editText = this.f8316e;
                        if (editText != null) {
                            editText.addTextChangedListener(new C2382a(this));
                        } else {
                            C8594l.m46783q("etPlaylistName");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("ivClean");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("tvSave");
                    throw null;
                }
            } else {
                C8594l.m46783q("tvCancel");
                throw null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public static final void m11164o(C2381a aVar, View view) {
            C8594l.m46771e(aVar, "this$0");
            C2388i b = aVar.f8315d.mo9340b();
            if (b != null) {
                C2380g gVar = aVar.f8319h;
                if (gVar != null) {
                    b.mo9366b(gVar);
                } else {
                    C8594l.m46783q("createPlaylistDialog");
                    throw null;
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public static final void m11165p(C2381a aVar, View view) {
            C8594l.m46771e(aVar, "this$0");
            EditText editText = aVar.f8316e;
            if (editText != null) {
                String obj = editText.getText().toString();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                aVar.m11156d(C8437p.m46563l0(obj).toString());
                return;
            }
            C8594l.m46783q("etPlaylistName");
            throw null;
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public static final void m11166q(C2381a aVar, View view) {
            C8594l.m46771e(aVar, "this$0");
            EditText editText = aVar.f8316e;
            if (editText != null) {
                editText.setText(BuildConfig.FLAVOR);
            } else {
                C8594l.m46783q("etPlaylistName");
                throw null;
            }
        }

        /* renamed from: b */
        public final C2380g mo9332b() {
            C2380g gVar = new C2380g(this.f8312a);
            this.f8319h = gVar;
            if (gVar != null) {
                m11155c(gVar, this);
                C2380g gVar2 = this.f8319h;
                if (gVar2 != null) {
                    return gVar2;
                }
                C8594l.m46783q("createPlaylistDialog");
                throw null;
            }
            C8594l.m46783q("createPlaylistDialog");
            throw null;
        }

        /* renamed from: i */
        public final C2381a mo9333i(long[] jArr) {
            C8594l.m46771e(jArr, "musicIds");
            this.f8315d.mo9346h(jArr);
            return this;
        }

        /* renamed from: j */
        public final C2381a mo9334j(int i) {
            this.f8315d.mo9344f(i);
            return this;
        }

        /* renamed from: k */
        public final C2381a mo9335k(C2388i iVar) {
            C8594l.m46771e(iVar, "savePlaylistListener");
            this.f8315d.mo9345g(iVar);
            return this;
        }
    }

    /* renamed from: com.coocent.music.base.ui.view.g$b */
    /* compiled from: CreatePlaylistDialog.kt */
    public static final class C2383b {

        /* renamed from: a */
        private long[] f8321a;

        /* renamed from: b */
        private String f8322b = BuildConfig.FLAVOR;

        /* renamed from: c */
        private String f8323c = BuildConfig.FLAVOR;

        /* renamed from: d */
        private int f8324d;

        /* renamed from: e */
        private C2388i f8325e;

        /* renamed from: a */
        public final int mo9339a() {
            return this.f8324d;
        }

        /* renamed from: b */
        public final C2388i mo9340b() {
            return this.f8325e;
        }

        /* renamed from: c */
        public final String mo9341c() {
            return this.f8322b;
        }

        /* renamed from: d */
        public final long[] mo9342d() {
            return this.f8321a;
        }

        /* renamed from: e */
        public final String mo9343e() {
            return this.f8323c;
        }

        /* renamed from: f */
        public final void mo9344f(int i) {
            this.f8324d = i;
        }

        /* renamed from: g */
        public final void mo9345g(C2388i iVar) {
            this.f8325e = iVar;
        }

        /* renamed from: h */
        public final void mo9346h(long[] jArr) {
            this.f8321a = jArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2380g(Context context) {
        super(context);
        C8594l.m46771e(context, "context");
    }

    public void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            C8594l.m46770d(attributes, "it.attributes");
            C4446i iVar = C4446i.f13022a;
            Context context = getContext();
            C8594l.m46770d(context, "context");
            attributes.width = iVar.mo15138c(context);
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setAttributes(attributes);
            }
        }
    }
}
