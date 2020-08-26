package pl.jaworskimateusz.machineservice.mappers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lpl/jaworskimateusz/machineservice/mappers/IssueMapper;", "", "()V", "Companion", "app_debug"})
public final class IssueMapper {
    public static final pl.jaworskimateusz.machineservice.mappers.IssueMapper.Companion Companion = null;
    
    public IssueMapper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u00a8\u0006\u000b"}, d2 = {"Lpl/jaworskimateusz/machineservice/mappers/IssueMapper$Companion;", "", "()V", "mapToIssue", "Lpl/jaworskimateusz/machineservice/data/entity/Issue;", "issue", "Lpl/jaworskimateusz/machineservice/dto/IssueDto;", "mapToIssueDto", "mapToIssueList", "", "issues", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<pl.jaworskimateusz.machineservice.data.entity.Issue> mapToIssueList(@org.jetbrains.annotations.NotNull()
        java.util.List<pl.jaworskimateusz.machineservice.dto.IssueDto> issues) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pl.jaworskimateusz.machineservice.data.entity.Issue mapToIssue(@org.jetbrains.annotations.NotNull()
        pl.jaworskimateusz.machineservice.dto.IssueDto issue) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pl.jaworskimateusz.machineservice.dto.IssueDto mapToIssueDto(@org.jetbrains.annotations.NotNull()
        pl.jaworskimateusz.machineservice.data.entity.Issue issue) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}