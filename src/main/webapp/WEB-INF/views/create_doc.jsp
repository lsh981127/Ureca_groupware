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
    <h1>�ް� ��û��</h1>
    <fieldset>
        <legend>�ް� ��û��</legend>
        <p>
            <label for="employee_name">
                �̸�:
                <input type="text" id="employee_name" name="employee_name" />
            </label>
        </p>

        <p>
            <label for="department">
                �μ�:
                <input type="text" id="department" name="department" />
            </label>
        </p>

        <p>
            <label for="position">
                ��å:
                <input type="text" id="position" name="position" />
            </label>
        </p>

        <p>
            <label for="vac_type">
                �ް� ����:
                <select id="vac_type" name="vac_type">
                    <option value="annual">����</option>
                    <option value="half">����</option>
                </select>
            </label>
        </p>

        <p>
            <label for="vac_start">
                �Ⱓ: <input type="datetime-local" id="vac_start" name="vac_start" />
                <span>~</span>
                <input type="datetime-local" id="vac_end" name="vac_end" />
            </label>
        </p>

        <p>������</p>
        <label class="form">
            1��: <input type="number" name="sign_path_emp_no1" />
        </label>
        <label class="form">
            2��: <input type="number"  name="sign_path_emp_no2" />
        </label>
        <label class="form">
            3��: <input type="number" name="sign_path_emp_no3" />
        </label>
        <p>
            <button type="submit">����</button>
        </p>
    </fieldset>
</form>
</body>

