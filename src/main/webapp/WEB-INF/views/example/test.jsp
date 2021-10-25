<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>yi_TF</title>
</head>
<body>
    <h1>테스트</h1>

    <form action="insert-test" method="post">
        <input type="text" name="data_test" required>
        <button type="submit">전송</button>
    </form>



    <hr>

    <table>
        <tr>
            <th>번호</th>
            <th>내용</th>
            <th>삭제</th>
        </tr>
    <c:forEach var="item" items="${test}">
        <tr>
            <td>
                ${item.no}
            </td>
            <td>
                ${item.dataTest}
            </td>
            <td>
                <form action="delete-test" method="post">
                    <input type="text" name="no" value="${item.no}" hidden>
                    <button type="submit">
                        삭제하기
                    </button>
                </form>
            </td>
        </tr>
    </c:forEach>
    </table>

</body>
</html>
