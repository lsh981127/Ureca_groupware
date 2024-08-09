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
<form action="/submit" method="POST">
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
        <label for="first_approval">
            1��: <input type="text" id="first_approval" name="first_approval" />
        </label>
        <label for="second_approval">
            2��: <input type="text" id="second_approval" name="second_approval" />
        </label>
        <label for="third_approval">
            3��: <input type="text" id="third_approval" name="third_approval" />
        </label>
        <p>
            <button type="submit">����</button>
        </p>
    </fieldset>
</form>
</body>

