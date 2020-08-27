package pl.jaworskimateusz.machineservice.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0014\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lpl/jaworskimateusz/machineservice/adapter/IssueRecyclerViewAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lpl/jaworskimateusz/machineservice/data/entity/Issue;", "Lpl/jaworskimateusz/machineservice/adapter/IssueRecyclerViewAdapter$IssueViewHolder;", "context", "Landroid/content/Context;", "onIssueListener", "Lpl/jaworskimateusz/machineservice/adapter/IssueRecyclerViewAdapter$OnIssueListener;", "(Landroid/content/Context;Lpl/jaworskimateusz/machineservice/adapter/IssueRecyclerViewAdapter$OnIssueListener;)V", "getContext", "()Landroid/content/Context;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "IssueViewHolder", "OnIssueListener", "app_release"})
public final class IssueRecyclerViewAdapter extends androidx.recyclerview.widget.ListAdapter<pl.jaworskimateusz.machineservice.data.entity.Issue, pl.jaworskimateusz.machineservice.adapter.IssueRecyclerViewAdapter.IssueViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final pl.jaworskimateusz.machineservice.adapter.IssueRecyclerViewAdapter.OnIssueListener onIssueListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public pl.jaworskimateusz.machineservice.adapter.IssueRecyclerViewAdapter.IssueViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.adapter.IssueRecyclerViewAdapter.IssueViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public IssueRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.adapter.IssueRecyclerViewAdapter.OnIssueListener onIssueListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lpl/jaworskimateusz/machineservice/adapter/IssueRecyclerViewAdapter$IssueViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "onIssueListener", "Lpl/jaworskimateusz/machineservice/adapter/IssueRecyclerViewAdapter$OnIssueListener;", "(Lpl/jaworskimateusz/machineservice/adapter/IssueRecyclerViewAdapter;Landroid/view/View;Lpl/jaworskimateusz/machineservice/adapter/IssueRecyclerViewAdapter$OnIssueListener;)V", "keywords", "Landroid/widget/TextView;", "getKeywords", "()Landroid/widget/TextView;", "onClick", "", "p0", "app_release"})
    public final class IssueViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView keywords = null;
        private final android.view.View view = null;
        private final pl.jaworskimateusz.machineservice.adapter.IssueRecyclerViewAdapter.OnIssueListener onIssueListener = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getKeywords() {
            return null;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View p0) {
        }
        
        public IssueViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        pl.jaworskimateusz.machineservice.adapter.IssueRecyclerViewAdapter.OnIssueListener onIssueListener) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lpl/jaworskimateusz/machineservice/adapter/IssueRecyclerViewAdapter$OnIssueListener;", "", "onIssueClick", "", "position", "", "app_release"})
    public static abstract interface OnIssueListener {
        
        public abstract void onIssueClick(int position);
    }
}