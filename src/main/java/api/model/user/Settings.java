package api.model.user;

import java.util.List;

public class Settings {
    private String weekStart;
    private String timeZone;
    private String timeFormat;
    private String dateFormat;
    private Boolean sendNewsletter;
    private Boolean weeklyUpdates;
    private Boolean longRunning;
    private Boolean scheduledReports;
    private Boolean approval;
    private Boolean pto;
    private Boolean alerts;
    private Boolean reminders;
    private Boolean timeTrackingManual;
    private Boolean collapseAllProjectLists;
    private Boolean dashboardPinToTop;
    private Boolean isCompactViewOn;
    private String dashboardSelection;
    private String dashboardViewType;
    private Integer projectListCollapse;
    private SummaryReportSettings summaryReportSettings;

    public String getWeekStart() { return weekStart; }

    public void setWeekStart(String weekStart) { this.weekStart = weekStart; }

    public String getTimeZone() { return timeZone; }

    public void setTimeZone(String timeZone) { this.timeZone = timeZone; }

    public String getTimeFormat() { return timeFormat; }

    public void setTimeFormat(String timeFormat) { this.timeFormat = timeFormat; }

    public String getDateFormat() { return dateFormat; }

    public void setDateFormat(String dateFormat) { this.dateFormat = dateFormat; }

    public Boolean getSendNewsletter() { return sendNewsletter; }

    public void setSendNewsletter(Boolean sendNewsletter) { this.sendNewsletter = sendNewsletter; }

    public Boolean getWeeklyUpdates() { return weeklyUpdates; }

    public void setWeeklyUpdates(Boolean weeklyUpdates) { this.weeklyUpdates = weeklyUpdates; }

    public Boolean getLongRunning() { return longRunning; }

    public void setLongRunning(Boolean longRunning) { this.longRunning = longRunning; }

    public Boolean getScheduledReports() { return scheduledReports; }

    public void setScheduledReports(Boolean scheduledReports) { this.scheduledReports = scheduledReports; }

    public Boolean getApproval() { return approval; }

    public void setApproval(Boolean approval) { this.approval = approval; }

    public Boolean getPto() { return pto; }

    public void setPto(Boolean pto) { this.pto = pto; }

    public Boolean getAlerts() { return alerts; }

    public void setAlerts(Boolean alerts) { this.alerts = alerts; }

    public Boolean getReminders() { return reminders; }

    public void setReminders(Boolean reminders) { this.reminders = reminders; }

    public Boolean getTimeTrackingManual() { return timeTrackingManual; }

    public void setTimeTrackingManual(Boolean timeTrackingManual) { this.timeTrackingManual = timeTrackingManual; }

    public Boolean getCollapseAllProjectLists() { return collapseAllProjectLists; }

    public void setCollapseAllProjectLists(Boolean collapseAllProjectLists) { this.collapseAllProjectLists = collapseAllProjectLists; }

    public Boolean getDashboardPinToTop() { return dashboardPinToTop; }

    public void setDashboardPinToTop(Boolean dashboardPinToTop) { this.dashboardPinToTop = dashboardPinToTop; }

    public Boolean getCompactViewOn() { return isCompactViewOn; }

    public void setCompactViewOn(Boolean compactViewOn) { isCompactViewOn = compactViewOn; }

    public String getDashboardSelection() { return dashboardSelection; }

    public void setDashboardSelection(String dashboardSelection) { this.dashboardSelection = dashboardSelection; }

    public String getDashboardViewType() { return dashboardViewType; }

    public void setDashboardViewType(String dashboardViewType) { this.dashboardViewType = dashboardViewType; }

    public Integer getProjectListCollapse() { return projectListCollapse; }

    public void setProjectListCollapse(Integer projectListCollapse) { this.projectListCollapse = projectListCollapse; }

    public SummaryReportSettings getSummaryReportSettings() { return summaryReportSettings; }

    public void setSummaryReportSettings(SummaryReportSettings summaryReportSettings) { this.summaryReportSettings = summaryReportSettings; }
}
