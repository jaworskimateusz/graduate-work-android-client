package pl.jaworskimateusz.machineservice.mappers

import pl.jaworskimateusz.machineservice.data.entity.Issue
import pl.jaworskimateusz.machineservice.dto.IssueDto

class IssueMapper {
    companion object {
        fun mapToIssueList(issues: List<IssueDto>): List<Issue> {
            return issues.map { mapToIssue(it) }

        }

        fun mapToIssue(issue: IssueDto): Issue {
            return Issue(
                    issue.issueId,
                    issue.keywords,
                    issue.description,
                    issue.solution,
                    issue.workerSignature,
                    issue.machineId
            )
        }

        fun mapToIssueDto(issue: Issue): IssueDto {
            return IssueDto(
                    issue.issueId,
                    issue.keywords,
                    issue.description,
                    issue.solution,
                    issue.workerSignature,
                    issue.machineId
            )
        }
    }
}
