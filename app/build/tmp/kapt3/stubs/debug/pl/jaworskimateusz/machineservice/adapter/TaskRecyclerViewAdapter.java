package pl.jaworskimateusz.machineservice.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0018\u0019B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lpl/jaworskimateusz/machineservice/adapter/TaskRecyclerViewAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lpl/jaworskimateusz/machineservice/data/entity/Task;", "Lpl/jaworskimateusz/machineservice/adapter/TaskRecyclerViewAdapter$TaskViewHolder;", "context", "Landroid/content/Context;", "onTaskListener", "Lpl/jaworskimateusz/machineservice/adapter/TaskRecyclerViewAdapter$OnTaskListener;", "(Landroid/content/Context;Lpl/jaworskimateusz/machineservice/adapter/TaskRecyclerViewAdapter$OnTaskListener;)V", "getContext", "()Landroid/content/Context;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setSolved", "imageView", "Landroid/widget/ImageView;", "solved", "OnTaskListener", "TaskViewHolder", "app_debug"})
public final class TaskRecyclerViewAdapter extends androidx.recyclerview.widget.ListAdapter<pl.jaworskimateusz.machineservice.data.entity.Task, pl.jaworskimateusz.machineservice.adapter.TaskRecyclerViewAdapter.TaskViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final pl.jaworskimateusz.machineservice.adapter.TaskRecyclerViewAdapter.OnTaskListener onTaskListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public pl.jaworskimateusz.machineservice.adapter.TaskRecyclerViewAdapter.TaskViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.adapter.TaskRecyclerViewAdapter.TaskViewHolder holder, int position) {
    }
    
    private final void setSolved(android.widget.ImageView imageView, int solved) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public TaskRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.adapter.TaskRecyclerViewAdapter.OnTaskListener onTaskListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lpl/jaworskimateusz/machineservice/adapter/TaskRecyclerViewAdapter$TaskViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "onTaskListener", "Lpl/jaworskimateusz/machineservice/adapter/TaskRecyclerViewAdapter$OnTaskListener;", "(Lpl/jaworskimateusz/machineservice/adapter/TaskRecyclerViewAdapter;Landroid/view/View;Lpl/jaworskimateusz/machineservice/adapter/TaskRecyclerViewAdapter$OnTaskListener;)V", "date", "Landroid/widget/TextView;", "getDate", "()Landroid/widget/TextView;", "solved", "Landroid/widget/ImageView;", "getSolved", "()Landroid/widget/ImageView;", "title", "getTitle", "onClick", "", "p0", "app_debug"})
    public final class TaskViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView title = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView date = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView solved = null;
        private final android.view.View view = null;
        private final pl.jaworskimateusz.machineservice.adapter.TaskRecyclerViewAdapter.OnTaskListener onTaskListener = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getSolved() {
            return null;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View p0) {
        }
        
        public TaskViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        pl.jaworskimateusz.machineservice.adapter.TaskRecyclerViewAdapter.OnTaskListener onTaskListener) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lpl/jaworskimateusz/machineservice/adapter/TaskRecyclerViewAdapter$OnTaskListener;", "", "onTaskClick", "", "position", "", "app_debug"})
    public static abstract interface OnTaskListener {
        
        public abstract void onTaskClick(int position);
    }
}