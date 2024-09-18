#!/usr/bin/env python3
# -*- coding: utf-8 -*-
# BitBake Toaster UI tests implementation
#
# Copyright (C) 2023 Savoir-faire Linux
#
# SPDX-License-Identifier: GPL-2.0-only


from flask import Flask, request, jsonify

app = Flask(__name__)

@app.route('/numbers', methods=['POST'])
def get_even_numbers():
    data = request.json
    if not isinstance(data, list):
        return jsonify({"error": "Input must be a list of numbers"}), 400

    even_numbers = [num for num in data if isinstance(num, (int, float)) and num % 2 == 0]
    return jsonify(even_numbers)

@app.route('/sum', methods=['POST'])
def calculate_sum():
    data = request.json
    if not isinstance(data, dict) or 'num1' not in data or 'num2' not in data:
        return jsonify({"error": "Input must be a JSON object with 'num1' and 'num2'"}), 400

    num1 = data['num1']
    num2 = data['num2']
    
    if not isinstance(num1, (int, float)) or not isinstance(num2, (int, float)):
        return jsonify({"error": "Both 'num1' and 'num2' must be numbers"}), 400

    total_sum = num1 + num2
    return jsonify({"sum": total_sum})

if __name__ == '__main__':
    app.run(debug=True)
