#!/usr/bin/env bash
set -euo pipefail

mvn clean test
mvn jacoco:report

echo
echo "JaCoCo report generated."
echo "Open the forwarded port 8000 in the Codespaces Ports panel."
echo

cd target/site/jacoco
python3 -m http.server 8000
