package org.javatop.principle.single;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-06-20 15:33
 * @description : 违反了单一职责原则，ReportManager类既负责生成报告，又负责打印报告。
 */
public class ReportManager {
    public String generateReport() {
        // 生成报告的逻辑
        return "Report Content";
    }

    public void printReport(String report) {
        // 打印报告的逻辑
        System.out.println(report);
    }
}
