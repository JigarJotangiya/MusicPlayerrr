package com.coocent.music.base.p056ui.folder.p057ui;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.coocent.music.base.p056ui.folder.widget.EmptyRecyclerView;
import java.io.File;
import p159f.p166c.p181e.p182a.p190b.C4448b;
import p159f.p166c.p181e.p182a.p190b.C4449c;
import p159f.p166c.p181e.p182a.p190b.p193j.p194b.C4465a;
import p159f.p166c.p181e.p182a.p190b.p193j.p195c.C4471c;

/* renamed from: com.coocent.music.base.ui.folder.ui.DirectoryFragment */
public class DirectoryFragment extends Fragment {

    /* renamed from: g */
    private View f8275g;

    /* renamed from: h */
    private String f8276h;

    /* renamed from: i */
    private C4465a f8277i;

    /* renamed from: j */
    private EmptyRecyclerView f8278j;

    /* renamed from: k */
    private C2370f f8279k;

    /* renamed from: l */
    private C2363a f8280l;

    /* renamed from: com.coocent.music.base.ui.folder.ui.DirectoryFragment$a */
    interface C2363a {
        /* renamed from: u */
        void mo9303u(File file);
    }

    /* renamed from: a */
    public static DirectoryFragment m11115a(String str, C4465a aVar) {
        DirectoryFragment directoryFragment = new DirectoryFragment();
        Bundle bundle = new Bundle();
        bundle.putString("arg_file_path", str);
        bundle.putSerializable("arg_filter", aVar);
        directoryFragment.setArguments(bundle);
        return directoryFragment;
    }

    /* renamed from: b */
    private void m11116b() {
        if (getArguments().getString("arg_file_path") != null) {
            this.f8276h = getArguments().getString("arg_file_path");
        }
        this.f8277i = (C4465a) getArguments().getSerializable("arg_filter");
    }

    /* renamed from: c */
    private void m11117c() {
        C2370f fVar = new C2370f(C4471c.m19553b(this.f8276h, this.f8277i));
        this.f8279k = fVar;
        fVar.mo9315f(new C2366b(this));
        this.f8278j.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f8278j.setAdapter(this.f8279k);
        this.f8278j.setEmptyView(this.f8275g);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void mo9298e(View view, int i) {
        C2363a aVar = this.f8280l;
        if (aVar != null) {
            aVar.mo9303u(this.f8279k.mo9312c(i));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f8280l = (C2363a) activity;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C4449c.fragment_lyric_directory, viewGroup, false);
        this.f8278j = (EmptyRecyclerView) inflate.findViewById(C4448b.directory_recycler_view);
        this.f8275g = inflate.findViewById(C4448b.directory_empty_view);
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
        this.f8280l = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m11116b();
        m11117c();
    }
}
