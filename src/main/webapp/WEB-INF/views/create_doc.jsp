<%@ page	language="java"
            contentType="text/html; charset=EUC-KR"
            pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
        }

        .container input {
            border: 1px solid black;
            padding: 8px;
            height: 40px;
            box-sizing: border-box;
        }
    </style>
</head>
<body>
<form action="/ureca/doc/create_doc" method="POST">
    <h1>휴가 신청서</h1>
    <fieldset>
        <legend>휴가 신청서</legend>
        <p>
            <label for="employee_name">
                이름:
                <input type="text" id="employee_name" name="employee_name" />
            </label>
        </p>

        <p>
            <label for="department">
                부서:
                <input type="text" id="department" name="department" />
            </label>
        </p>

        <p>
            <label for="position">
                직책:
                <input type="text" id="position" name="position" />
            </label>
        </p>

        <p>
            <label for="vac_type">
                휴가 종류:
                <select id="vac_type" name="vac_type">
                    <option value="annual">연차</option>
                    <option value="half">반차</option>
                </select>
            </label>
        </p>

        <p>
            <label for="vac_start">
                기간: <input type="datetime-local" id="vac_start" name="vac_start" />
                <span>~</span>
                <input type="datetime-local" id="vac_end" name="vac_end" />
            </label>
        </p>

        <p>승인자</p>
        <label class="form">
            1차: <input type="number" name="sign_path_emp_no1" />
        </label>
        <label class="form">
            2차: <input type="number"  name="sign_path_emp_no2" />
        </label>
        <label class="form">
            3차: <input type="number" name="sign_path_emp_no3" />
        </label>
        <p>
            <button type="submit">제출</button>
        </p>
    </fieldset>
</form>
</body>

